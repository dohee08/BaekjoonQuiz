package baekjoon_4_while¹®;

import java.util.Scanner;

public class quiz_10952 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if(a == 0 && b == 0) {
				flag = false;
				break;
			}
			
			System.out.println(a+b);
		}

	}

}
