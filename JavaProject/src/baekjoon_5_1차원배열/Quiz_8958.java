package baekjoon_5_1차원배열;

import java.util.Scanner;

public class Quiz_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] quiz = new String[scan.nextInt()];
		
		for(int i=0; i<quiz.length; i++) {
			quiz[i] = scan.next();
		}
		
		for(int j=0; j<quiz.length; j++) {
			int count = 0;
			int sum = 0;
			
			for(int k=0; k<quiz[j].length(); k++) {
				if(quiz[j].charAt(k) == 'O') {
					count++;
				}
				else {
					count = 0;
				}
				sum = sum + count;
			}
			
			
			System.out.println(sum);
		}
		
	}

}
