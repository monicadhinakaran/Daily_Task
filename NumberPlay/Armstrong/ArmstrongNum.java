package dailyTask;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(arms(num));
	}

	public static int count(int num) {
		int count = 0;
		while(num > 0) {
			num /=10;
			count++;
		}
		return count;
	}
	
	public static int pow(int base, int exp) {
		int pow = 1;
		
		while(exp != 0) {
			pow *= base;
			exp--;
		}
		return pow;
	}
	
	public static boolean arms (int num) {
		int value = num;
		int count = count(num);
		int armvalue = 0;
		while(num > 0) {
			armvalue += pow(num % 10, count);
			num /= 10;
		}
		return value == armvalue;
	}
}
