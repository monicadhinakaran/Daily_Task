package dailyTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

    //Space Complexity : O(n)
    //Time Complexity: O(n)
    
		List<Integer> values = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				values.add(arr[i]);		
			}
		}
		
		int NoOfZeros = arr.length - values.size();
		
		for (int i = 0; i < values.size(); i++) {
			arr[i] = values.get(i);			
		}
		
		for (int i = NoOfZeros; i < arr.length; i++) {
			arr[i] = 0;	
		}
		
		
		System.out.println(Arrays.toString(arr));
	}

}
