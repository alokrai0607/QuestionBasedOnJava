package DSA.SortingAlgos;

public class MergeSort {

	int[] array;
	int[] tempMergArray;
	int length;

	public static void main(String[] args) {
		// Define an input array with some values
		int[] inputArray = { 48, 36, 13, 52, 19, 94, 21 };
		// Create an instance of MergeSort class
		MergeSort ms = new MergeSort();
		// Call the sort method to sort the inputArray
		ms.sort(inputArray);

		// Print the sorted array
		for (int i : inputArray) {
			System.out.println(i + " ");
		}
	}

	public void sort(int[] inputArray) {
		// Initialize instance variables with inputArray
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergArray = new int[length];
		// Start the sorting process by dividing the array
		divideArray(0, length - 1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {
		// Check if there is more than one element in the array
		if (lowerIndex < higherIndex) {
			// Calculate the middle index
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

			// Recursively divide the left half of the array
			divideArray(lowerIndex, middle);

			// Recursively divide the right half of the array
			divideArray(middle + 1, higherIndex);

			// Merge the divided arrays
			mergeArray(lowerIndex, middle, higherIndex);
		}
	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		// Copy elements from the original array to the temporary array
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArray[i] = array[i];
		}

		// Initialize pointers for the left and right sub arrays
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		// Merge the two sub arrays into the original array
		while (i <= middle && j <= higherIndex) {
			// Compare elements from the left and right sub arrays
			if (tempMergArray[i] <= tempMergArray[j]) {
				// If the element from the left sub array is smaller, copy it to the original
				// array
				array[k] = tempMergArray[i];
				i++;
			} else {
				// If the element from the right sub array is smaller, copy it to the original
				// array
				array[k] = tempMergArray[j];
				j++;
			}
			k++;
		}

		// Copy any remaining elements from the left sub array (if any)
		while (i <= middle) {
			array[k] = tempMergArray[i];
			k++;
			i++;
		}
	}
}
