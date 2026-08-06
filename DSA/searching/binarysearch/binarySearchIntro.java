package dsa.searching.binarysearch;

public class binarySearchIntro {

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
//			int mid = start + end / 2; integer range overflow problem
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			} else if (target > arr[mid]) {
				start = mid + 1;

			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int[] arr = { -11, -8, -4, 0, 4, 8, 11 };
		int target = 8;

		System.out.println(binarySearch(arr, target));
	}

}
