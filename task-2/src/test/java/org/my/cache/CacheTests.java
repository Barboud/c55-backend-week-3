package org.my.cache;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CacheTests {

  // Arrange
  private Cache<String> cache;
  @BeforeEach
  void setUp() {
    cache = new Cache<String>();
  }


  @Test
  void putIncreasesSize() {
    // Act
    cache.put("name", "Salem");

    // Assert
    assertEquals(1, cache.size());
  }


  @Test
  void getItemNotExist() {
    // Act
    cache.put("City", "Amsterdam");

    // Assert
      assertNull(cache.get("Age"));
  }


  @Test
  void removeItem() {
    // Act
    cache.put("City", "Amsterdam");
    cache.remove("City");

    // Assert
    assertEquals(0, cache.size());
  }


  @Test
  void returnSizeArray() {
    // Act
    cache.put("City", "Amsterdam");
    cache.put("Name", "Ali");

    // Assert
    assertEquals(2, cache.size());
  }

  @Test
  void emptyArray() {
    // Act
    cache.put("City", "Amsterdam");
    cache.put("Name", "Ali");
    cache.clear();
    // Assert
    assertEquals(0, cache.size());
  }

}
