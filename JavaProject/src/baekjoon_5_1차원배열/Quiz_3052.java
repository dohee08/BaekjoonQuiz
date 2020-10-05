package baekjoon_5_1차원배열;

import java.util.Scanner;

public class Quiz_3052 {

	public static void main(String[] args) {
		int[] num = new int[10];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		int[] remain = new int[10];
		for(int j=0; j<num.length; j++) {
			remain[j] = num[j]%42;
		}
		
		//개수 계산
		int sum = 0;
		for(int i=0; i<42; i++) {
			int count = 0;
			for(int j=0; j<remain.length; j++) {
				if(remain[j] == i) {
					count++;
				}
			}
			if(count >=2) {
				count = 1;
			}
			sum = sum + count;
		}
		System.out.println(sum);
	}

}
