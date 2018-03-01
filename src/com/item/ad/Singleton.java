package com.item.ad;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// Reference: https://stackoverflow.com/questions/17387457/implementation-of-readresolve-method-for-serializable-singleton-instance
// Reference: https://stackoverflow.com/questions/30011829/why-declare-all-instance-fields-transient-in-singletons
// Reference: https://stackoverflow.com/questions/3544919/what-are-transient-and-volatile-modifiers

// Note that making it implement serializable is not sufficient enough to make it serializable.
// To maintain and guarantee singleton:
// 1. Need to add a modifier, transient
// 2. Provide a readResolve method
public class Singleton implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -538307425020022903L;
  
  // Advantages to make this public static final
  // 1. It is clearly indicated to the developers that this class is a static
  // public static final Singleton SINGLETON = new Singleton();

  // Advantages to make this static final and create static factory method:
  // 1. It is easier to change your mind whether to keep it as a singleton or not
  // 2. TODO: Concerns of generic type (item 27)
  private static Singleton SINGLETON = new Singleton();
  // Note: If I were to make this transient then it will not be part of the serialization
  private int i;

  private Singleton() {
    //
  }

  private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ois.defaultReadObject();
    SINGLETON = this;
  }

  public static Singleton getInstance() {
    return SINGLETON;
  }

  private Object readResolve() {
    return SINGLETON;
  }
  
  public static void main(String[] args) throws Throwable {

    Singleton s = Singleton.getInstance();
    s.i = 5;

    ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
    oos.writeObject(getInstance());
    oos.close();

    s.i = 7; //modified after serialization

    InputStream is = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(is);
    Singleton deserialized = (Singleton) ois.readObject();
    System.out.println(deserialized.i);  // prints 5
  }

}
