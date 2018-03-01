package com.item.ab.extra.one; 
 
public class RandomIntGenerator implements RandomGenerator<Integer>{

  private final int min;
  private final int max;

  RandomIntGenerator(int min, int max) {
      this.min = min;
      this.max = max;
  }

  public Integer next() {
    return this.min;
  }
  
}
