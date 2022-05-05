package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CircleTest {
  @Test
  public void surfaceAreaOfACircle() {
    Circle circle = new Circle(15);
    BigDecimal actualSurfaceArea = circle.getSurfaceArea();
    Assertions.assertEquals( new BigDecimal( "706.5" ), actualSurfaceArea );
  }
}
