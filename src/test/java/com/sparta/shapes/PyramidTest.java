package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PyramidTest {
  @Test
  public void getSurfaceArea() {
    Pyramid pyramid = new Pyramid( 4, 8 );
    BigDecimal actualSurfaceArea = pyramid.getSurfaceArea();

    Assertions.assertEquals( new BigDecimal( "154.51" ), actualSurfaceArea );
  }

  @Test
  public void getVolume() {
    Pyramid pyramid = new Pyramid( 3, 4 );
    BigDecimal actualVolume = pyramid.getVolume();

    Assertions.assertEquals( new BigDecimal( "16.00" ), actualVolume );
  }

  @Test
  public void getString() {
    Pyramid pyramid = new Pyramid( 2, 6 );
    String result = pyramid.toString();
    Assertions.assertEquals( "Shape: Pyramid, Base: 6.0, Height: 2.0, Surface Area: 79.27, Volume: 24.12", result );
  }

  @Test
  public void iAmATriangle() {
    Pyramid yellowPyramid = new Pyramid( 7, 5, Colour.YELLOW );

    String actualResult = yellowPyramid.iAmA();

    Assertions.assertEquals( "I AM A PYRAMID OF VOLUME 58.25 AND I AM YELLOW!", actualResult );
  }
}
