package dailyTask;

import java.util.Arrays;

public class FirstAndLastPosition {
	public static void searchRange(int[] arr, int target) {
		int[] res = new int[2];

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] != target && arr[i] == target)
				res[0] = i;

			if (arr[i] == target && arr[i + 1] != target)
				res[1] = i;

		}
		if (res[0] == 0)
			res[0] = -1;
		if (res[1] == 0)
			res[1] = -1;

		System.out.println(Arrays.toString(res));

	}

	public static void main(String[] args) {
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		searchRange(arr, target);
	}
}
