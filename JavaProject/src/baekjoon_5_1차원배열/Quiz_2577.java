package baekjoon_5_1차원배열;

import java.util.Scanner;

public class Quiz_2577 {

	public static void main(String[] args) {
		int[] num = new int[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		//곱한 값
		int mul = 1;
		for(int j=0; j<num.length; j++) {
			mul = mul*num[j];
		}
		
		//곱한 값 배열에 넣기
		String mul_st = Integer.toString(mul);
		int[] gop = new int[mul_st.length()];
		
		for(int k=0; k<gop.length; k++) {
			gop[k] = mul_st.charAt(k)-48;	//-'0'또는 -48 연산 필요
		}
		
		//개수 계산
		for(int i=0; i<10; i++) {
			int count = 0;
			for(int j=0; j<gop.length; j++) {
				if(gop[j] == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}

}
