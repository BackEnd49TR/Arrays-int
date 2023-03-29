package telra.arrays;

import java.util.Arrays;

public class MyArraysInt {

	public static int[] addNumber(int[] array, int num) {

		int arrayDest[] = Arrays.copyOf(array, array.length + 1);
		arrayDest[array.length] = num;
		return arrayDest;
	}

	public static int[] removeNumber(int[] array, int index) {

		if (index >= 0 && index <= array.length - 1) {
			int arrayDest[] = new int[array.length - 1];
			System.arraycopy(array, 0, arrayDest, 0, index);
			System.arraycopy(array, index + 1, arrayDest, index, (array.length - 1) - index);
			return arrayDest;
		}
		return array;

	}

	public static int[] insertNumber(int[] array, int index, int num) {

		if (index >= 0 && index <= array.length ) {
			int arrayDest[] = new int[array.length + 1];
			System.arraycopy(array, 0, arrayDest, 0, index);
			arrayDest[index] = num;
			System.arraycopy(array, index, arrayDest, index + 1, array.length - index);
			return arrayDest;
		}
		return array;
	}
}
