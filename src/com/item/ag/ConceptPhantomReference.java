package com.item.ag;

import junit.framework.TestCase;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;


// https://stackoverflow.com/questions/11397522/when-to-use-weak-and-phantom-references-in-java
public class ConceptPhantomReference extends TestCase {

  public static void testPhantomReference() throws IllegalArgumentException, InterruptedException {
    
    Object obj = new Object();
    ReferenceQueue<Object> refQueue = new ReferenceQueue<>();
    PhantomReference<Object> phantomObj = new PhantomReference<Object>(obj, refQueue);
    
    obj = null;
    obj = phantomObj.get();
    assertNull(obj);
    
  }
  
}
