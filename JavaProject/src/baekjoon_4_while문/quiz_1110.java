package baekjoon_4_while��;

import java.io.IOException;
import java.util.Scanner;

public class quiz_1110 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt(); //���� ��

		int count = 0;
		int result = num;
		
		while(true) {
			int num1 = num/10; //10�� �ڸ�
			int num2 = num%10; //1�� �ڸ�
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
