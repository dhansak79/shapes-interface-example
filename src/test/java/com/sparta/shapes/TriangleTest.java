package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class TriangleTest {

  @Test
  public void getSurfaceArea() {
    Triangle triangle = new Triangle( 12, 7 );
    BigDecimal surfaceArea = triangle.getSurfaceArea();

    Assertions.assertEquals( new BigDecimal( "42.00" ), surfaceArea );
  }

  @Test
  public void getString() {
    Triangle triangle = new Triangle( 5, 5 );
    String result = triangle.toString();
    Assertions.assertEquals( "Shape: Triangle, Base: 5.0, Height: 5.0, Surface Area: 12.50", result );
  }

  @Test
  public void iAmATriangle() {
    Triangle greenTriangle = new Triangle( 5, 7, Colour.GREEN );

    String actualResult = greenTriangle.iAmA();

    Assertions.assertEquals( "I AM A TRIANGLE OF AREA 17.50 AND I AM GREEN!", actualResult );
  }
}
