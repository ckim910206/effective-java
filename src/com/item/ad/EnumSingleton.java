package com.item.ad;

public enum EnumSingleton {

  ENUM_SINGLETON;
  
  public static EnumSingleton getInstance() {
    return EnumSingleton.ENUM_SINGLETON;
  }
  
}
