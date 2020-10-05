package baekjoon_5_1차원배열;

import java.util.Scanner;

public class Quiz_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score = new double[scan.nextInt()];
		
		for(int i=0; i<score.length; i++) {
			score[i] = scan.nextInt();
		}
		
		//최대값 구하기
		double max = 0;
		int idx = 0;
		for(int k=0; k<score.length; k++) {
			if(score[k] > max) {
				max = score[k];
				idx = k;
			}
		}
		
		//새로 계산
		double[] temp = new double[score.length];
		for(int j=0; j<score.length; j++) {
			temp[j] = score[j]/max*100;
			}
		
		//새로 계산한 값 평균
		double sum = 0;
		for(int i=0; i<temp.length; i++) {
			sum = sum + temp[i];
		}
		
		System.out.println(sum/score.length);
	}

}
