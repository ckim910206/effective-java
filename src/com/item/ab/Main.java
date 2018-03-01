package com.item.ab;

import com.item.ab.extra.one.RandomGenerator;
import com.item.ab.extra.one.RandomGenerators;

import junit.framework.TestCase;

public class Main extends TestCase {

  public void testAdvantageOne() {
    // It is clear what I will be calling from calling the static factory method, which is a singleton.
    Example singleton = Example.singleton();
    assertNotNull(singleton);
  }

  public void testAdvantageTwo() {
    // I am not creating new object. This is similar to FlyWeight pattern.
    Example singletonA = Example.singleton();
    Example singletonB = Example.singleton();
    assertTrue(singletonA == singletonB);

    // From this, we can assure that we can use == instead equals()
    Example notSameA = Example.newObject();
    Example notSameB = Example.newObject();
    assertFalse(notSameA == notSameB);
    assertFalse(notSameA.equals(notSameB)); // We will have to write our own hashCode or equals to make this true.
  }

  public void testAdvantageThree() {
    // Cannot instantiate the RandomIntGenerator
    // RandomIntGenerator randIntGenerator = new RandomIntGenerator();
    
    // Now we can access this generator
    RandomGenerator<Integer> randIntGenerator = RandomGenerators.getIntGenerator();
    assertNotNull(randIntGenerator);
  }
  
  public void testAdvantageFour() {
    // Make things less verbose. We now have diamond operators to avoid this.
  }

}
