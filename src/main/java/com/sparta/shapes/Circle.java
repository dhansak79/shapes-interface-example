package com.sparta.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle implements Shape {
  private final int radius;

  public Circle( int radius ) {
    this.radius = radius;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    BigDecimal pi = new BigDecimal( "3.14" );
    BigDecimal radius = BigDecimal.valueOf( this.radius );
    return radius.pow( 2 ).multiply( pi ).setScale( 2, RoundingMode.HALF_UP );
  }



}
