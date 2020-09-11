package baekjoon_2;

import java.util.Scanner;

public class quiz_2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(min < 45) {
			hour = hour-1;
			min = 60-(45-min);
			if(hour<0) {
				hour = 23;
			}
			System.out.println(hour+" "+min);
		}else {
			System.out.println(hour+" "+(min-45));
		}
		
	}

}
