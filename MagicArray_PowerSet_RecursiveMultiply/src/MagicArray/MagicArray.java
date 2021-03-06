package MagicArray;

/*
 * Magic Index: A magic index in an array A [ 0 ... n -1]
 * is defined to be an index such that A[i] = i.
 * Given a sorted array of distinct integers,
 * write a method to find a magic index, if one exists, in array A.
 */
public class MagicArray {

	public static int findMagicIndex(int[] arr, int start, int end) {

		if (start <= end) {
			int middle = (start + end) / 2;
			if (middle == arr[middle]) {
				return middle;
			}
			if (middle > arr[middle]) {
				return findMagicIndex(arr, middle + 1, end);
			} else {
				return findMagicIndex(arr, start, middle - 1);
			}
		}
		System.out.println("magic index not found");
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { -55, -44, -1, 0, 1, 5, 9 };
		int[] arr1 = { 0, 2, 3 };

		System.out.println("magic index: " + findMagicIndex(arr, 0, arr.length - 1));
	}
}
