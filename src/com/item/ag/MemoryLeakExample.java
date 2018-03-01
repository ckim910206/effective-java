package com.item.ag;

import java.util.Arrays;
import java.util.EmptyStackException;

// Another leak is at caches.
// Last example is when there are listeners and other callbacks.
public class MemoryLeakExample {

  // Note: This is a class that manages its own memory, the programmer should be alert for memory leaks.
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;
  
  public MemoryLeakExample() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }
  
  public void push(Object e) {
    ensureCapacity();
    elements[size++] = e;
  }
  
  public Object pop() {
    if (size == 0) throw new EmptyStackException();
    Object result = elements[--size];
    // This is where memory leak may happen.
    // Nulling out object references should be the exception rather than the norm.
    elements[size] = null;
    return result;
  }
  
  /*
   * Ensure space for at least one more element, roughly doubling the capcity each time the array needs to grow
   */
  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }
}

