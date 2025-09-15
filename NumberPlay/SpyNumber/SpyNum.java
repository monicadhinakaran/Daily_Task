package dailyTask;

import java.util.Scanner;

public class SpyNum {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       
       System.out.println(spy(num));
	}

	public static boolean spy (int num) {
		int add = 0;
		int product = 1;
		
		while(num != 0) {
			int temp = num % 10;
			add += temp;
			product *= temp;
			num /= 10;
		}
		
		return add == product ;
	}
}
