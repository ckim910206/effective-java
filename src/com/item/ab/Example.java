 package com.item.ab;

public class Example {

  private static final Example SINGLETON = new Example();
  
  public Example() {
    
  }
  
  /**
   * Advantage #1: One advantage of static factory methods is that, unlike constructors, they have names.
   * Advantage #2: A second advantage of static factory methods is that, unlike constructors, they are not required
   *               to create a new object each time they are invoked. 
   * @return
   */
  public static Example singleton() {
    return SINGLETON;
  }
  
  
  public static Example newObject() {
    return new Example();
  }
  
}
