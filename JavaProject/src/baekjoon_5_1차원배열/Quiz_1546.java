package baekjoon_5_1�����迭;

import java.util.Scanner;

public class Quiz_1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score = new double[scan.nextInt()];
		
		for(int i=0; i<score.length; i++) {
			score[i] = scan.nextInt();
		}
		
		//�ִ밪 ���ϱ�
		double max = 0;
		int idx = 0;
		for(int k=0; k<score.length; k++) {
			if(score[k] > max) {
				max = score[k];
				idx = k;
			}
		}
		
		//���� ���
		double[] temp = new double[score.length];
		for(int j=0; j<score.length; j++) {
			temp[j] = score[j]/max*100;
			}
		
		//���� ����� �� ���
		double sum = 0;
		for(int i=0; i<temp.length; i++) {
			sum = sum + temp[i];
		}
		
		System.out.println(sum/score.length);
	}

}
