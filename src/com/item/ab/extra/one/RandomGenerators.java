package com.item.ab.extra.one;

public final class RandomGenerators {
  // Suppresses default constructor, ensuring non-instantiability.
  private RandomGenerators() {}

  public static final RandomGenerator<Integer> getIntGenerator() {
    return new RandomIntGenerator(Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  public static final RandomGenerator<String> getStringGenerator() {
    return new RandomStringGenerator("");
  }
}
