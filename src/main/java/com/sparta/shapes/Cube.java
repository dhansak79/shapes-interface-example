package com.sparta.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cube implements Shape, ThreeDimensionalShape {

  private final double edge;

  public Cube( double edge ) {
    this.edge = edge;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    return BigDecimal.valueOf( edge ).pow( 2 ).multiply( new BigDecimal( "6" ) );
  }

  @Override
  public BigDecimal getVolume() {
    return BigDecimal.valueOf( edge ).pow( 3 ).setScale( 2, RoundingMode.HALF_UP );

  }
}
