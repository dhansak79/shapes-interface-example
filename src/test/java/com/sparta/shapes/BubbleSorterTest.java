package com.sparta.shapes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSorterTest {

  @Test
  void bubbleSortTestTwo() {
    BubbleSorter bubbleSorter = new BubbleSorter();
    // Given
    int[] arr = new int[]{ 6, 23, 43, 20, 3, 2, 9, 7, 1, 5, 4, 8, 23, 21, 14, 13, 17, 19, 15, 24, 33, 25, 27, 26 };
    int[] expected = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 13, 14, 15, 17, 19, 20, 21, 23, 23, 24, 25, 26, 27, 33, 43 };
    // When
    int[] result = bubbleSorter.bubbleSort( arr );
    // Then
    assertThat( result ).isEqualTo( expected );
  }
}