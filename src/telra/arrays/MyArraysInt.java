package telra.arrays;

import java.util.Arrays;

public class MyArraysInt {

	public static int[] addNumber(int[] array, int num) {

		int arrayDest[] = Arrays.copyOf(array, array.length + 1);
		arrayDest[arrayDest.length - 1] = num;

		return arrayDest;
	}

	public static int[] removeNumber(int[] array, int index) {

		int arrayDest[] = new int[array.length - 1];
		System.arraycopy(array, 0, arrayDest, 0, index);
		System.arraycopy(array, index + 1, arrayDest, index, array.length - 1 - index);
		if (index < 0 || index > array.length - 1) {
			System.arraycopy(array, 0, arrayDest, 0, array.length);
		}

		return arrayDest;
	}

	public static int[] insertNumber(int[] array, int index, int num) {

		int arrayDest[] = new int[array.length + 1];
		System.arraycopy(array, 0, arrayDest, 0, index);
		System.arraycopy(array, index, arrayDest, index + 1, array.length - index);
		arrayDest[index] = num;
		if (index < 0 || index > array.length - 1) {
			System.arraycopy(array, 0, arrayDest, 0, array.length);
		}

		return arrayDest;
	}
}
