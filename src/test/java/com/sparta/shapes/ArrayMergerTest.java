package com.sparta.shapes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ArrayMergerTest {

  @Test
  void mergeLeftArraySmallerThanRight() {
    // Given
    ArrayMerger arrayMerger = new ArrayMerger();
    int[] evens = new int[]{ 2, 4, 6, 8 };
    int[] odds = new int[]{ 1, 3, 5, 7, 9, 11, 13 };
    int[] expectedResult = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13 };

    // When
    int[] actualResult = arrayMerger.merge( odds, evens );
    // Then
    assertThat( actualResult ).isEqualTo( expectedResult);
  }

  @Test
  void mergeRightArraySmallerThanLeft() {
    // Given
    ArrayMerger arrayMerger = new ArrayMerger();
    int[] evens = new int[]{ 2, 4, 6, 8 };
    int[] odds = new int[]{ 1, 3, 5, 7, 9, 11, 13 };
    int[] expectedResult = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 13 };

    // When
    int[] actualResult = arrayMerger.merge( evens, odds );
    // Then
    assertThat( actualResult ).isEqualTo( expectedResult);
  }

  @Test
  void mergeSameSizeArrays() {
    // Given
    ArrayMerger arrayMerger = new ArrayMerger();
    int[] evens = new int[]{ 2, 4, 6, 8 };
    int[] odds = new int[]{ 1, 3, 5, 7 };
    int[] expectedResult = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8 };

    // When
    int[] actualResult = arrayMerger.merge( evens, odds );
    // Then
    assertThat( actualResult ).isEqualTo( expectedResult);
  }

  @Test
  void mergeArraysWithSomeMatchingNumbers() {
    // Given
    ArrayMerger arrayMerger = new ArrayMerger();
    int[] arrayOne = new int[]{ 1, 2, 4, 6, 8 };
    int[] arrayTwo = new int[]{ 1, 2, 3, 5, 7 };
    int[] expectedResult = new int[]{ 1, 1, 2, 2, 3, 4, 5, 6, 7, 8 };

    // When
    int[] actualResult = arrayMerger.merge( arrayOne, arrayTwo );
    // Then
    assertThat( actualResult ).isEqualTo( expectedResult);
  }

  @Test
  void twoIdenticalArrays() {
    // Given
    ArrayMerger arrayMerger = new ArrayMerger();
    int[] arrayOne = new int[]{ 1, 2, 4, 6, 8 };
    int[] arrayTwo = new int[]{ 1, 2, 4, 6, 8 };
    int[] expectedResult = new int[]{ 1, 1, 2, 2, 4, 4, 6, 6, 8, 8 };

    // When
    int[] actualResult = arrayMerger.merge( arrayOne, arrayTwo );
    // Then
    assertThat( actualResult ).isEqualTo( expectedResult);
  }


}