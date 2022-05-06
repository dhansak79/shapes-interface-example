package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CircleTest {

  @Test
  public void surfaceAreaOfACircle() {
    Circle circle = new Circle( 15 );
    BigDecimal actualSurfaceArea = circle.getSurfaceArea();

    Assertions.assertEquals( new BigDecimal( "706.50" ), actualSurfaceArea );
  }

  @Test
  public void circleToStringTest() {
    // Given
    Circle circle = new Circle( 5 );
    // When
    String result = circle.toString();
    // Then
    Assertions.assertEquals( "Shape: Circle, Radius: 5, Surface Area: 78.50", result );
  }

  @Test
  public void iAmACircle() {
    Circle purpleCircle = new Circle( 68, Colour.PURPLE );

    String actualResult = purpleCircle.iAmA();

    Assertions.assertEquals( "I AM A CIRCLE OF RADIUS 68 AND I AM PURPLE!", actualResult );
  }
}
