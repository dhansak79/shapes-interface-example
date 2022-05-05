package com.sparta.shapes;

import java.math.BigDecimal;

public class Cube implements Shape, ThreeDimensionalShape {

  private final double edge;

  public Cube( double edge ) {
    this.edge = edge;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    return null;
  }

  @Override
  public BigDecimal getVolume() {
    //TODO Investigate why it returns the same amount of zeros as the power
    return BigDecimal.valueOf( edge ).pow( 3 );
  }
}
