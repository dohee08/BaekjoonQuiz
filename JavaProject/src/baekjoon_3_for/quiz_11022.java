package baekjoon_3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quiz_11022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int case_num = Integer.parseInt(br.readLine().trim());
		
		for(int i=1; i<=case_num; i++) {
			String text = br.readLine();
			String[] num = text.split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			int c = a+b;
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
		}

	}

}
