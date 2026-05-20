package org.my.cache;

import java.util.HashMap;
import java.util.Map;

class Cache<T> {

  private Map<String, T> cash = new HashMap<>();

  public void put(String key, T value) {
    cash.put(key, value);
  }

  public T get(String key) {
    return cash.get(key);
  }

  public T remove(String key) {
    return cash.remove(key);
  }

  public int size() {
      return cash.size();
  }

  public void clear() {
    cash.clear();
  }

}
