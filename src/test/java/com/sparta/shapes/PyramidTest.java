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

}
