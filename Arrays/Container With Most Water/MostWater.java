package dailyTask;

public class ContainMostWater {

	public static int maxArea(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int area = 0;
		int temp = 0;
		int lower = 0;

		while (start != end) {
			if (arr[start] < arr[end])
				lower = arr[start];
			else
				lower = arr[end];
			
			temp = lower * (end - start);

			if (temp > area)
				area = temp;

			if (arr[start] <= arr[end])
				start++;
			else
				end--;
		}
		return area;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
//		int[] arr = {1,1};
		System.out.println(maxArea(arr));
	}

}
