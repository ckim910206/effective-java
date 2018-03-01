package com.item.ag;

import junit.framework.TestCase;

import java.lang.ref.WeakReference;

// http://javaconceptoftheday.com/types-of-references-in-java-strong-soft-weak-and-phantom/
public class ConceptWeakReference extends TestCase {

  public static void testWeakReference() {
    
    Object obj = new Object();
    WeakReference<Object> weakObj = new WeakReference<>(obj);
    
    obj = null;
    obj = weakObj.get();
    assertNotNull(obj);
    
    obj = null;
    System.gc();
    obj = weakObj.get();
    assertNull(obj);
    
  }
  
}
