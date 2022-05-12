package com.sparta.shapes;

public class BubbleSorter {

  public int[] bubbleSort( int[] inputArray ) {
    boolean swapped = true;

    int numberOfLoops = 0;
    while ( swapped ) {
      swapped = false;
      for ( int i = 0; i < inputArray.length - 1; i++ ) {
        if ( inputArray[ i ] > inputArray[ i + 1 ] ) {
          int swaps = inputArray[ i ];
          inputArray[ i ] = inputArray[ i + 1 ];
          inputArray[ i + 1 ] = swaps;
          swapped = true;
          System.out.println( "Loop number: " + numberOfLoops++ );
        }
      }
    }
    return inputArray;
  }
}

