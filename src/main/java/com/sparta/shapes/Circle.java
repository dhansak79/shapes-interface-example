package com.sparta.shapes;

import java.math.BigDecimal;

public class Circle implements Shape{
  private int radius;

  public Circle( int radius ) {
    this.radius = radius;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    BigDecimal pi = new BigDecimal("3.14");
    BigDecimal radius = BigDecimal.valueOf(this.radius);
    BigDecimal surfaceArea = radius.pow(2).multiply(pi);
    return surfaceArea;
  }
}
