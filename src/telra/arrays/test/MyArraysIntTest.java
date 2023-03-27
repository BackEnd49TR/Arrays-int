package telra.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MyArraysIntTest {

	@Test
	void testAddNumber() {
		int array[] = { 1, 2, 3, 4, 5 };
		int arrayExp[] = { 1, 2, 3, 4, 5, 0 };
		assertArrayEquals(arrayExp, Arrays.copyOf(array, arrayExp.length));
		int num = 6;
		arrayExp[5] = num;
		int arrayDest[] = { 1, 2, 3, 4, 5, 6 };
		assertArrayEquals(arrayExp, arrayDest);

	}

	@Test
	void testRemoveNumber() {
		int array[] = { 1, 2, 3, 4, 5 };

		int arrayExp[] = { 1, 2, 4, 5 };
		int arrayDest[] = new int[4];

		System.arraycopy(array, 0, arrayDest, 0, 2);
		System.arraycopy(array, 3, arrayDest, 2, 2);

		assertArrayEquals(arrayDest, arrayExp);

		int arrayDest1[] = new int[5];

		System.arraycopy(array, 0, arrayDest1, 0, 5);

//		assertEquals(0, Arrays.binarySearch(index, 0));
//		assertEquals(1, Arrays.binarySearch(index, array.length - 1));
//		assertEquals(-1, Arrays.binarySearch(index, -1));
//		assertEquals(-3, Arrays.binarySearch(index, array.length));
	}

	@Test
	void testInsertNumber() {

		int array[] = { 1, 2, 4, 5 };
		int num = 3;
		int arrayExp[] = { 1, 2, 3, 4, 5 };
		int arrayDest[] = new int[5];

		System.arraycopy(array, 0, arrayDest, 0, 2);
		System.arraycopy(array, 2, arrayDest, 3, 2);
		arrayDest[2] = num;

		assertArrayEquals(arrayDest, arrayExp);

		int arrayDest1[] = new int[4];

		System.arraycopy(array, 0, arrayDest1, 0, 4);
//
//		assertEquals(0, Arrays.binarySearch(index, 0));
//		assertEquals(1, Arrays.binarySearch(index, array.length - 1));
//		assertEquals(-1, Arrays.binarySearch(index, -1));
//		assertEquals(-3, Arrays.binarySearch(index, array.length));
//		
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
	}

}
