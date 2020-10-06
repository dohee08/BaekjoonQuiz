package baekjoon_5_1차원배열;

import java.util.Scanner;

public class Quiz_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casenum = scan.nextInt();
		int stnum;
		int sum;
		double average = 0;
		int count;
		int[] score = new int[1000];
		
		for(int i=0; i<casenum; ++i) {
			stnum = scan.nextInt();
			sum = 0; count=0;
			
			//학생점수 입력
			for(int j=0; j<stnum; ++j) {
				score[j] = scan.nextInt();
			}
			
			//학생평균 점수 구하기
			for(int k=0; k<stnum; ++k) {
				sum = sum + score[k];
			}
			average = (double)sum/stnum;
			
			//평균보다 높은 학생 수 구하기
			for(int l=0; l<stnum; ++l) {
				if(score[l] > average) {
					count++;
				}
			}
			
			//학생 비율 구하기, 소수점 셋째 자리 반올림
			System.out.printf("%.3f", 100.0*count/stnum);
			System.out.println("%");
		}
	}

}
