package telra.arrays;

import java.util.Arrays;

public class MyArraysInt {

	public static int[] addNumber(int[] array, int num) {

		int arrayDest[] = Arrays.copyOf(array, array.length + 1);
		arrayDest[array.length] = num;
		return arrayDest;
	}

	public static int[] removeNumber(int[] array, int index) {
		int[] arrayDest = array;
		if (index > -1 && index < array.length) {
			arrayDest = new int[array.length - 1];
			System.arraycopy(array, 0, arrayDest, 0, index);
			System.arraycopy(array, index + 1, arrayDest, index, arrayDest.length - index);
		}
		return arrayDest;

	}

	public static int[] insertNumber(int[] array, int index, int num) {

		int[] arrayDest = array;
		if (index > -1 && index <= array.length) {
			arrayDest = new int[array.length + 1];
			System.arraycopy(array, 0, arrayDest, 0, index);
			System.arraycopy(array, index, arrayDest, index + 1, array.length - index);
			arrayDest[index] = num;
		}
		return arrayDest;
	}

	public static int[] insertNumberSorted(int[] array, int num) {
		int index = Arrays.binarySearch(array, num);
		if (index < 0) {
			index = -index - 1;
		}

		return insertNumber(array, index, num);
	}

}
