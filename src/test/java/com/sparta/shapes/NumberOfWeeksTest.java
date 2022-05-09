package com.sparta.shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NumberOfWeeksTest {

  @Test
  public void modulus() {
    int dayNum = 23;
    Assertions.assertEquals( 3, getNumberOfWeeks( dayNum ) );
    Assertions.assertEquals( 2, getNumberOfDays( dayNum ) );
  }

  @Test
  public void wholeNumberOfWeeksNoRemainder() {
    int dayNum = 28;
    Assertions.assertEquals( 4, getNumberOfWeeks( dayNum ) );
    Assertions.assertEquals( 0, getNumberOfDays( dayNum ) );
  }

  @Test
  public void oneWeek() {
    int dayNum = 7;
    Assertions.assertEquals( 1, getNumberOfWeeks( dayNum ) );
    Assertions.assertEquals( 0, getNumberOfDays( dayNum ) );
  }

  @Test
  public void lessThanOneWeek() {
    int dayNum = 5;
    Assertions.assertEquals( 0, getNumberOfWeeks( dayNum ) );
    Assertions.assertEquals( 5, getNumberOfDays( dayNum ) );
  }


  private int getNumberOfWeeks( int dayNum ) {
    return dayNum / 7; // this gives me the answer rounded down
  }

  private int getNumberOfDays( int dayNum ) {
    return dayNum % 7; // this gives me the remainder
  }

  @Test
  public void getLargestNumberInArray() {
    int[] numbers = { 5000, -20, 7, 17, 13, 19, 5 };

    Arrays.sort( numbers );
    int actualResult = numbers[ numbers.length - 1 ];
    Assertions.assertEquals( 5000, actualResult );
  }
}
