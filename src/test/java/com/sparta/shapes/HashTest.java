package com.sparta.shapes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HashTest {

  @Test
  public void hashSetWhereThingsAreEqual() {
    Circle circleOne = new Circle( 1 );
    Circle circleTwo = new Circle( 1 );
    assertThat( circleOne.equals( circleTwo ) ).isTrue();
    // a hashset will only contain one of each thing - our override of hashCode is used to determine equality
    // if the hash is equal we don't put two identical objects in the HashSet
    // if we remove our overridden hashCode implementation we will end up with two circles in our HashSet and
    // have inconsistency with our equals method
    HashSet< Circle > circles = new HashSet<>();
    circles.add( circleOne );
    circles.add( circleTwo );
    assertThat( circles.size() ).isEqualTo( 1 );

    HashMap< Integer, Shape > shapes = new HashMap<>();
    shapes.put( 1, circleOne );
    shapes.put( 2, circleTwo );
    assertThat( shapes.size() ).isEqualTo( 2 );
  }

  @Test
  public void checkStringEquality() {
    assertThat( isFoo( "blah" ) ).isFalse();
    assertThat( isFoo( "foo" ) ).isTrue();
    assertThat( isFoo( null ) ).isFalse();


  }

  private boolean isFoo( String string ) {
    if ( string != null ) {
      return string.equals( "foo" );
    }
    return false;

  }

  @Test
  public void addNumbersInArrayTest() {
    int[] array = new int[]{ 0, 1, 2, 3, 4, 5, 3 };
    assertThat( addNumbersInTheArray( array, 5, 6 ) ).isEqualTo( 8 );
    assertThat( addNumbersInTheArray( array, 0, 1 ) ).isEqualTo( 1 );
    assertThat( addNumbersInTheArray( array, 0, 6 ) ).isEqualTo( 18 );
  }

  private int addNumbersInTheArray( int[] array, int n1, int n2 ) {
    int result = 0;
    while ( n1 <= n2 ) {
      result = result + array[ n1 ];
      n1++;
    }
    return result;
  }

}

