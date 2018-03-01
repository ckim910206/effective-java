/*
 * Copyright (c) 2017 Financial Engines, Inc.  All Rights Reserved.
 * Sunnyvale, CA
 *
 * File: RandomStringGenerator.java
 * Author: ckim
 */
 
package com.item.ab.extra.one;
 
public class RandomStringGenerator implements RandomGenerator<String> {

  private final String prefix;
  
  RandomStringGenerator(String prefix) {
      this.prefix = prefix;
  }

  public String next() {
    return this.prefix;
  }
  
}
