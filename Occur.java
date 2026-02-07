import java.util.Iterator;
import java.util.Scanner;

public class IntegerOccurance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] Res = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			Res[arr[i]]++;
		}
		
		for (int i = 0; i < Res.length; i++) {
			if(Res[i] != 0) {
				System.out.println(i +  " occurs ----> " + Res[i] + " times.");
			}
		}
	}
