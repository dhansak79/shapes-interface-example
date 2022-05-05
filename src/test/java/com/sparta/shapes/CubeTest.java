package com.sparta.shapes;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CubeTest {

  @Test
  void getSurfaceArea() {
  }

  @Test
  void getVolume() {
    Cube cube = new Cube( 5.0 );
    BigDecimal volume = cube.getVolume();
    assertEquals( new BigDecimal( "125.000" ), volume );
  }
}