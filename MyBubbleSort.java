
import java.util.Arrays;

public class MyBubbleSort {
	public void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length - 1 ; i++) {

			for (int j = 0; j < arr.length -1 ; j++) {

				if(arr[j] > arr[j+1]){
					//swap them
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {50,1,2,3,4};

		System.out.println("Unsorted -->" + Arrays.toString(arr));

		MyBubbleSort object = new MyBubbleSort();
		object.bubbleSort(arr);

		System.out.println("Sorted -->" + Arrays.toString(arr));

	}
}