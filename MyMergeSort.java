import java.util.ArrayList;
import java.util.Arrays;

public class MyMergeSort {
	public static void main(String[] args) {
		int[] arr = {20, 2, 8, 60, 50, 90, 3};
		int low = 0;
		int high = arr.length - 1;
		System.out.println("Unsorted -->" + Arrays.toString(arr));
		MyMergeSort object = new MyMergeSort();
		object.mergeSort(arr, low, high);
		System.out.println("Sorted -->" + Arrays.toString(arr));
		ArrayList<Integer> test = new ArrayList<>();


	}

	public void mergeSort(int[] arr, int low, int high) {

		if (low >= high) {
			return;
		}

		int mid = (low + high) / 2;

		mergeSort(arr, low, mid);

		mergeSort(arr, mid + 1, high);

		merge(arr, low, mid, high);
	}

	private void merge(int[] arr, int low, int mid, int high) {

		int s = high + 1;
		int[] crr = new int[s];

		int i = low;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				crr[k] = arr[i];
				k = k + 1;
				i = i + 1;
			} else {
				crr[k] = arr[j];
				k = k + 1;
				j = j + 1;
			}
		}

		if (i > mid) {

			while (j <= high) {
				crr[k] = arr[j];
				k = k + 1;
				j = j + 1;
			}
		} else {

			while (i <= mid) {
				crr[k] = arr[i];
				k = k + 1;
				i = i + 1;
			}
		}

		int p = 0;
		for (int x = low; x <= high; x++) {
			arr[x] = crr[p];
			p = p + 1;
		}
	}
}