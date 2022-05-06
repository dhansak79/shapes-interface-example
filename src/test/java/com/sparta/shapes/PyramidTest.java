package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PyramidTest {


  @Test
  public void getSurfaceArea(){
    Pyramid pyramid = new Pyramid(4, 8);
    BigDecimal actualSurfaceArea = pyramid.getSurfaceArea();
    Assertions.assertEquals( new BigDecimal( "154.51" ), actualSurfaceArea );

  }



}
