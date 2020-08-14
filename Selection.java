import java.util.Arrays;

public class Selection {
	public void selectionSort(int[] arr){

		int sortedIndex = arr.length;

		for (int i = 0; i < arr.length - 1 ; i++) {
			int maximumIndex = 0;
			int maximumElement = arr[0];

			for (int j = 0; j < sortedIndex ; j++) {
				if (maximumElement < arr[j]) {
					maximumElement = arr[j];
					maximumIndex = j;
				}
			}
			System.out.println(maximumElement);

			sortedIndex --;
			int temp = arr[sortedIndex];
			arr[sortedIndex] = arr[maximumIndex];
			arr[maximumIndex] = temp;

		}
	}

	public static void main(String[] args) {
		int[] arr = {50,20,3,2,80,9};
		System.out.println("unsorted-->" + Arrays.toString(arr));
		Selection object = new Selection();
		object.selectionSort(arr);
		System.out.println("sorted-->" + Arrays.toString(arr));
	}


}
