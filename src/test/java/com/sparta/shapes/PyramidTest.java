package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidTest {
  @Test
  void getSurfaceArea() {
    Pyramid pyramid = new Pyramid( 4, 8 );
    BigDecimal actualSurfaceArea = pyramid.getSurfaceArea();

    assertEquals( new BigDecimal( "154.51" ), actualSurfaceArea );
  }

  @Test
  void getVolume() {
    Pyramid pyramid = new Pyramid( 3, 4 );
    BigDecimal actualVolume = pyramid.getVolume();

    assertEquals( new BigDecimal( "16.00" ), actualVolume );
  }

  @Test
  void getString() {
    Pyramid pyramid = new Pyramid( 2, 6 );
    String result = pyramid.toString();
    Assertions.assertEquals( "Shape: Pyramid, Base: 6.0, Height: 2.0, Surface Area: 79.27, Volume: 24.12", result );
  }

}
