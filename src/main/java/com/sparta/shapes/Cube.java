package com.sparta.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cube implements Shape, ThreeDimensionalShape {

  private final double edge;
  private final Colour colour;

  public Cube( double edge ) {
    this.edge = edge;
    this.colour = Colour.PURPLE;
  }

  public Cube( double edge, Colour colour ) {
    this.edge = edge;
    this.colour = colour;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    return BigDecimal.valueOf( edge ).pow( 2 ).multiply( new BigDecimal( "6" ) );
  }

  @Override
  public BigDecimal getVolume() {
    return BigDecimal.valueOf( edge ).pow( 3 ).setScale( 2, RoundingMode.HALF_UP );
  }

  @Override
  public String toString() {
    return "Shape: Cube, Edge: " + edge + ", Surface Area: " + getSurfaceArea() + ", Volume: " + getVolume();
  }

  public String iAmA() {
    return "I AM A CUBE OF VOLUME " + getVolume() + " AND I AM " + colour + "!";
  }
}



