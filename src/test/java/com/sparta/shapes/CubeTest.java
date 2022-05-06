package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CubeTest {

  @Test
  void getSurfaceArea() {
    Cube cube = new Cube( 7.0 );
    BigDecimal surfaceArea = cube.getSurfaceArea();

    assertEquals( new BigDecimal( "294.00" ),surfaceArea);
  }

  @Test
  void getVolume() {
    Cube cube = new Cube( 5.0 );
    BigDecimal volume = cube.getVolume();

    assertEquals( new BigDecimal( "125.00" ), volume );
  }

  @Test
  void  getString(){
    Cube cube = new Cube( 3 );
    String result = cube.toString();
    Assertions.assertEquals( "Shape: Cube, Edge: 3.0, Surface Area: 54.00, Volume: 27.00", result );

  }

}