package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CircleTest {

  @Test
  public void surfaceAreaOfACircle() {
    Circle circle = new Circle( 15 );
    BigDecimal actualSurfaceArea = circle.getSurfaceArea();

    Assertions.assertEquals( new BigDecimal( "706.50" ), actualSurfaceArea );
  }

  @Test
  public void circleToStringTest() {
    // Given
    Circle circle = new Circle( 5 );
    // When
    String result = circle.toString();
    // Then
    Assertions.assertEquals( "Shape: Circle, Radius: 5, Surface Area: 78.50", result );
  }

  @Test
  public void iAmACircle() {
    Circle purpleCircle = new Circle( 68, Colour.PURPLE );

    String actualResult = purpleCircle.iAmA();

    Assertions.assertEquals( "I AM A CIRCLE OF RADIUS 68 AND I AM PURPLE!", actualResult );
  }

  @Test
  public void twoCirclesAreTheSame() {
    // Given
    Circle circleOne = new Circle( 5 );
    Circle circleTwo = new Circle( 5 );

    System.out.println( circleOne.hashCode() );
    System.out.println( circleTwo.hashCode() );

    if ( circleOne.equals( circleTwo ) ) {
      System.out.println( "The same!" );
    } else {
      System.out.println( "They're not the same!!" );
    }

    String a = "Daniel";
    String b = "Dan";
    b = b + "iel";
    System.out.println(a);
    System.out.println(b);

    if (a.equals( b )){
      System.out.println("True");
    } else {
      System.out.println("False");
    }

  }
}
