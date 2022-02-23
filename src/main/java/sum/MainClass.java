package sum;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		int[] arr = {5, 9, 8, 9, 3, 5, 8, 7, 9, 8};

		int target = 14;
		
		int[] sumArr = sumArray(arr, target);
		System.out.println(Arrays.toString(sumArr));
}

	private static int[] sumArray(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum == target){
					return new int [] {i,j};
				}
			}
		}
		return new int[] {-1};
	}
}