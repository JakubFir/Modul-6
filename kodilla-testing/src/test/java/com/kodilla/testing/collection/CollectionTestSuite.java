package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("when odd numbers exterminator has empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        System.out.println("Testing odd number exterminator empty list");
        //Given
        List<Integer> numbers = new ArrayList<>();
        //When
        int size = numbers.size();
        //Then
        if(size ==0) {
            Assertions.fail("List is empty");
        }
    }
    @DisplayName("when odd numbers exterminator has normal list")
    @Test
    void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing odd number exterminator normal list");
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        //When
        List<Integer> result = exterminator.exterminate(numbers);
        List<Integer> expectedResult = Arrays.asList(2,4);
        //Then
        Assertions.assertArrayEquals(new List[]{expectedResult}, new List[]{result});
    }
}
