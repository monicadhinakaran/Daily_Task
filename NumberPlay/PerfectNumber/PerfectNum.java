package dailyTask;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(perfect(num));
	}

	public static boolean perfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			sum += i;
		}

		return num == sum;
	}

}
