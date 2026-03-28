package leetcode;

public class repeated_number {
	public static void main(String[] args) {
		int[] arr = { 1 };

		int i = 0;
		while (i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;

			} else {
				i++;
			}

		}
		System.out.println();
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}