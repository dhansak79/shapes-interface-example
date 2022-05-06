package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TriangleTest {

  @Test
  void getSurfaceArea() {
    Triangle triangle = new Triangle( 12, 7 );
    BigDecimal surfaceArea = triangle.getSurfaceArea();

    assertEquals( new BigDecimal( "42.00" ), surfaceArea );
  }

  @Test
  void getString() {
    Triangle triangle = new Triangle( 5, 5 );
    String result = triangle.toString();
    assertEquals( "Shape: Triangle, Base: 5.0, Height: 5.0, Surface Area: 12.50", result );
  }

}