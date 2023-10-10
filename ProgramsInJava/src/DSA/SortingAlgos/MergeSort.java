package DSA.SortingAlgos;

public class MergeSort {

	int[] array;
	int[] tempMergArray;
	int length;

	public static void main(String[] args) {

		int[] inputArray = { 48, 36, 13, 52, 19, 94, 21 };
		MergeSort ms = new MergeSort();
		ms.sort(inputArray);

		for (int i : inputArray) {
			System.out.println(i + " ");
		}

	}

	public void sort(int[] inputArray) {
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergArray = new int[length];
		divideArray(0, length - 1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {

			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

			divideArray(lowerIndex, middle);

			divideArray(middle + 1, higherIndex);

			mergeArray(lowerIndex, middle, higherIndex);
		}
	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArray[i] = array[i];
		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {

			if (tempMergArray[i] <= tempMergArray[j]) {
				array[k] = tempMergArray[i];
				i++;
			} else {
				array[k] = tempMergArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArray[i];
			k++;
			i++;
		}

	}
}
