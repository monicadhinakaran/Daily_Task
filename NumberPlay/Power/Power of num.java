package dailyTask;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int exp = sc.nextInt();
		int pow = 1;
		
		while(exp > 0) {
			pow = num * pow;
			exp--;
		}
		System.out.println(pow);
	}

}
