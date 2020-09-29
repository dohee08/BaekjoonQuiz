package baekjoon_5_1차원배열;

import java.util.Scanner;

public class quiz_10818 {

	public static void main(String[] args) {
		int min = 1000000;
		int max = -1000000;
		
		Scanner scan = new Scanner(System.in);
		int[] array = new int[scan.nextInt()];
		
		for(int i=0; i<array.length; i++) {
			array[i] = scan.nextInt();
			
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println(min+" "+max);
		
		
	}

}
