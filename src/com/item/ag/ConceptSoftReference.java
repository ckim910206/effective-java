package com.item.ag;

import junit.framework.TestCase;

import java.lang.ref.SoftReference;

// http://javaconceptoftheday.com/types-of-references-in-java-strong-soft-weak-and-phantom/
public class ConceptSoftReference extends TestCase {

  public static void testSoftReference() {
    
    Object obj = new Object();
    SoftReference<Object> softObj = new SoftReference<>(obj);
    
    obj = null;
    
    obj = softObj.get();
    
    System.gc();
    
    assertNotNull(obj);
  }
  
}
