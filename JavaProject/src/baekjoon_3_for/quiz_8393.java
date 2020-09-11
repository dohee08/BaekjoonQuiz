package baekjoon_3_for;

import java.util.Scanner;

public class quiz_8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
