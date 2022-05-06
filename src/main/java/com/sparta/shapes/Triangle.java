package com.sparta.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle implements Shape {
  private final double base;
  private final double height;

  public Triangle( double base, double height ) {
    this.base = base;
    this.height = height;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    return BigDecimal.valueOf( base ).multiply( BigDecimal.valueOf( height ) ).multiply( new BigDecimal( "0.5" ) )
            .setScale( 2, RoundingMode.HALF_UP );
  }

  @Override
  public String toString() {
    return "Shape: Triangle, Base: " + base + ", Height: " + height + ", Surface Area: " + getSurfaceArea();
  }

}
