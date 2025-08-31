package dailyTask;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = sc.nextInt();
		
		int[] res = new int[2];
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					res[0] = arr[i];
					res[1] = arr[j];
				}
			}
		}
		
		System.out.println(Arrays.toString(res));
	}	

}
