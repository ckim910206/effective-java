package com.item.ag;

import junit.framework.TestCase;

public class ConceptStrongReference extends TestCase {
  
  public static void testStrongReference() {
    
    Object obj = new Object();
    obj = null;
    
    assertNull(obj);
  }
  
}
