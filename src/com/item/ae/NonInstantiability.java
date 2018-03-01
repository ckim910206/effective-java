 package com.item.ae;

// Such class that is just a grouping of static methods and static fields have acquired a bad reputation
// to avoid thinking in terms of objects, but they do have valid uses. For example, see Math, Arrays, or
// Collections utility classes.
 
// final modifier at class level is an modifier that indicates that it cannot be extended
//  1. It does not mean that all references to this class would act as if they were declared as final
//  2. It does not mean that all fields in the class are automatically final
public final class NonInstantiability extends DummySubClass {

  // Prevent the class to be instantiable and avoid inheritance
  private NonInstantiability() {
    throw new AssertionError();
  }
  
  public static Object[] sort(Object...objects) {
    return null;
  }
  
}
