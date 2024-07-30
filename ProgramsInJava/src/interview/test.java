package interview;

public class test {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 4 };
		int target = 6;
		int[] result = findTwoSum(arr, target);
		if (result != null) {
			System.out.println("Indices: " + result[0] + " " + result[1]);
		} else {
			System.out.println("No two sum solution found.");
		}
	}

	public static int[] findTwoSum(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null; // If no solution is found
	}
}
