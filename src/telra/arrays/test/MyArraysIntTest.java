package telra.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static telra.arrays.MyArraysInt.*;

class MyArraysIntTest {

	@Test
	void testAddNumber() {
		int array[] = { 1, 2, 3, 4, 5 };
		int arrayExp[] = { 1, 2, 3, 4, 5, 8 };
		assertArrayEquals(arrayExp, addNumber(array, 8));
	}

	@Test
	void testRemoveNumber() {
		int array[] = { 1, 2, 3, 4, 5 };
		int arrayExp[] = { 2, 3, 4, 5 };
		int arrayExp1[] = { 1, 2, 4, 5 };
		int arrayExp2[] = { 1, 2, 3, 4 };
		int arrayEmpty[] = {};

		assertArrayEquals(arrayExp, removeNumber(array, 0));
		assertArrayEquals(arrayExp1, removeNumber(array, 2));
		assertArrayEquals(arrayExp2, removeNumber(array, 4));
		assertArrayEquals(array, removeNumber(array, -1));
		assertArrayEquals(array, removeNumber(array, 5));
		assertArrayEquals(arrayEmpty, removeNumber(arrayEmpty, 0));
	}

	@Test
	void testInsertNumber() {

		int array[] = { 1, 2, 3 };
		int arrayExp[] = { -1, 1, 2, 3 };
		int arrayExp1[] = { 1, 2, -1, 3 };
		int arrayExp2[] = { 1, 2, 3, -1 };
		int arrayExp3[] = {-1};
		int arrayEmpty[] = {};
		

		assertArrayEquals(arrayExp, insertNumber(array, 0, -1));
		assertArrayEquals(arrayExp1, insertNumber(array, 2, -1));
		assertArrayEquals(arrayExp2, insertNumber(array, 3, -1));
		assertArrayEquals(array, insertNumber(array, -1, 0));
		assertArrayEquals(array, insertNumber(array, 4, 0));
		assertArrayEquals(arrayExp3, insertNumber(arrayEmpty, 0, -1));
		assertArrayEquals(arrayEmpty, insertNumber(arrayEmpty, 5, -1));

	}

	@Test
	void testCopyOf() {
		int array[] = { 1, 2, 3 };
		int expected1[] = { 1, 2, 3 };
		int expected2[] = { 1 };
		int expected3[] = { 1, 2, 3, 0, 0, 0 };
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}

	@Test
	void testArraycopy() {
		int array[] = { 1, 2, 3 };
		int array1[] = { 2, 5, 10 };
		int expected[] = { 5, 10, 1, 2, 20 };
		int arrayDest[] = new int[5];

		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);

		arrayDest[4] = 20;

		assertArrayEquals(expected, arrayDest);

	}

	@Test
	void testBinarySearchInt() {
		// only for sort array

		int array[] = { -9, -7, 5, 6, 6, 10, 11, 15 }; // array [0-7]
		assertEquals(0, Arrays.binarySearch(array, -9));
		assertEquals(3, Arrays.binarySearch(array, 6));
		assertEquals(7, Arrays.binarySearch(array, 15));
		assertEquals(3, Arrays.binarySearch(array, 6));

		assertEquals(-3, Arrays.binarySearch(array, 3));
		assertEquals(-8, Arrays.binarySearch(array, 12));
		assertEquals(-9, Arrays.binarySearch(array, 20));
		//assertTrue(Arrays.binarySearch(array, 0, 4, 0) < 0);
	}
	
	@Test
	@Disabled
	void testBinarySearchOutOfBound() {
		int array[] = {1,2,3};
		assertEquals(0, Arrays.binarySearch(array, 2, 0, 1));
		assertEquals(0, Arrays.binarySearch(array, -2, 2, 1));
		assertEquals(0, Arrays.binarySearch(array, 0, 6, 1));
	}

}
