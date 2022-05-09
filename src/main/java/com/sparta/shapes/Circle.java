package com.sparta.shapes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle implements Shape {
  private final int radius;
  private final Colour colour;

  public Circle( int radius ) {
    this.radius = radius;
    this.colour = Colour.PURPLE;
  }

  public Circle( int radius, Colour colour ) {
    this.radius = radius;
    this.colour = colour;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    BigDecimal pi = new BigDecimal( "3.14" );
    BigDecimal radius = BigDecimal.valueOf( this.radius );
    return radius.pow( 2 ).multiply( pi ).setScale( 2, RoundingMode.HALF_UP );
  }

  @Override
  public boolean equals( Object o ) {
    if ( this == o ) return true;
    if ( o == null || getClass() != o.getClass() ) return false;
    Circle circle = ( Circle ) o;
    return radius == circle.radius && colour == circle.colour;
  }

  @Override
  public int hashCode() {
    return Objects.hash( radius, colour );
  }

  @Override
  public String toString() {
    return "Shape: Circle, Radius: " + radius + ", Surface Area: " + getSurfaceArea();
  }

  public String iAmA() {
    return "I AM A CIRCLE OF RADIUS " + radius + " AND I AM " + colour + "!";
  }
}
