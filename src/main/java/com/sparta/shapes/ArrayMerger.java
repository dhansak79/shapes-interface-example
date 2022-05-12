package com.sparta.shapes;

public class ArrayMerger {

  public int[] merge( int[] leftArray, int[] rightArray ) {
    int[] mergedArray = new int[ leftArray.length + rightArray.length ];

    int leftArrayIndex = 0;
    int rightArrayIndex = 0;
    int mergedArrayIndex = 0;

    while ( leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length ) {
      if ( leftArray[ leftArrayIndex ] < rightArray[ rightArrayIndex ] ) {
        mergedArray[ mergedArrayIndex ] = leftArray[ leftArrayIndex ];
        leftArrayIndex++;
      } else {
        mergedArray[ mergedArrayIndex ] = rightArray[ rightArrayIndex ];
        rightArrayIndex++;
      }
      mergedArrayIndex++;
    }

    // keep adding all the numbers remaining on the left
    addRemainingFromArray( leftArray, mergedArray, leftArrayIndex, mergedArrayIndex );

    // keep adding all the numbers remaining on the right
    addRemainingFromArray( rightArray, mergedArray, rightArrayIndex, mergedArrayIndex );

    return mergedArray;
  }

  private void addRemainingFromArray( int[] rightArray, int[] mergedArray, int rightArrayIndex, int mergedArrayIndex ) {
    while ( rightArrayIndex < rightArray.length ) {
      mergedArray[ mergedArrayIndex ] = rightArray[ rightArrayIndex ];
      rightArrayIndex++;
      mergedArrayIndex++;
    }
  }


}
