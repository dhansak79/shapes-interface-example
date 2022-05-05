package com.sparta.shapes;

import java.math.BigDecimal;

public class Circle implements Shape{
  private int radius;

  public Circle( int radius ) {
    this.radius = radius;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    return new BigDecimal( "0" );
  }
}
