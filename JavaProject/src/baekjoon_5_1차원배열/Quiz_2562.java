package baekjoon_5_1차원배열;

import java.util.Scanner;

public class Quiz_2562 {

	public static void main(String[] args) {
		int[] num = new int[9];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		int max = 0;
		int count = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i] > max) {
				max = num[i];
				count = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(count);
	}

}
