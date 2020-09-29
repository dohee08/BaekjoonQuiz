package baekjoon_4_while문;

import java.io.IOException;
import java.util.Scanner;

public class quiz_1110 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt(); //원래 수

		int count = 0;
		int result = num;
		
		while(true) {
			int num1 = num/10; //10의 자리
			int num2 = num%10; //1의 자리
			int sum = num1+num2;
			
			result = (num2*10)+(sum%10);
			count++;
			
			if(result == num) {
				break;
			}
			
		}
		System.out.println(count);

	}

}
