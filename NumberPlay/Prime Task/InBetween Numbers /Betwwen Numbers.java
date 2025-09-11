package dailyTask;

import java.util.Scanner;

public class CheckingPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numstart = sc.nextInt();
		int numend = sc.nextInt();
		
		for(int i = numstart ; i< numend ; i++) {
			if(PrimeNum(i) == true) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean PrimeNum (int num) {
		int count = 0;
		for(int i = 2; i < num/2 ; i++) {
			if(num % i == 0) count++;
		}
		
		return count == 0 ? true : false; 
	}

}
