package com.sparta.shapes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Pyramid implements Shape, ThreeDimensionalShape {

  private final double height;
  private final double base;


  public Pyramid( double height, double base ) {
    this.height = height;
    this.base = base;
  }

  @Override
  public BigDecimal getSurfaceArea() {
    BigDecimal b = BigDecimal.valueOf( base );
    BigDecimal bSqr = b.pow( 2 );
    BigDecimal underRoot = bSqr.divide( new BigDecimal( 4 ), 2, RoundingMode.HALF_UP ).add( BigDecimal.valueOf( height ).pow( 2 ) );
    MathContext mathCont = new MathContext( 10 );
    BigDecimal rooted = underRoot.sqrt( mathCont );
    BigDecimal result = bSqr.add( rooted.multiply( b ).multiply( new BigDecimal( 2 ) ) );

    return result.setScale( 2, RoundingMode.HALF_UP );
  }

  @Override
  public BigDecimal getVolume() {
    BigDecimal a = BigDecimal.valueOf( base ).pow( 2 );
    BigDecimal h = BigDecimal.valueOf( height ).divide( new BigDecimal( "3" ), 2, RoundingMode.HALF_UP );

    return a.multiply( h ).setScale( 2, RoundingMode.HALF_UP );
  }

  @Override
  public String toString() {
    return "Shape: Pyramid, Base: " + base + ", Height: " + height + ", Surface Area: " + getSurfaceArea() + ", Volume: " + getVolume();

//    "Shape: Pyramid, Base: 6.0, Height: 2.0, Surface Area: 79.27"
  }

}
