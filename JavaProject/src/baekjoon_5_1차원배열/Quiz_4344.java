package baekjoon_5_1�����迭;

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
			
			//�л����� �Է�
			for(int j=0; j<stnum; ++j) {
				score[j] = scan.nextInt();
			}
			
			//�л���� ���� ���ϱ�
			for(int k=0; k<stnum; ++k) {
				sum = sum + score[k];
			}
			average = (double)sum/stnum;
			
			//��պ��� ���� �л� �� ���ϱ�
			for(int l=0; l<stnum; ++l) {
				if(score[l] > average) {
					count++;
				}
			}
			
			//�л� ���� ���ϱ�, �Ҽ��� ��° �ڸ� �ݿø�
			System.out.printf("%.3f", 100.0*count/stnum);
			System.out.println("%");
		}
	}

}
