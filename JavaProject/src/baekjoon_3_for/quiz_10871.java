package baekjoon_3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quiz_10871 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] num = br.readLine().split(" ");		
		int n = Integer.parseInt(num[0]);
		int x = Integer.parseInt(num[1]);
		
		String[] text_array = br.readLine().split(" ");	
				
		for(int i=0; i<n; i++) {				
			if(Integer.parseInt(text_array[i]) < x) {
					bw.write(text_array[i]+" ");
				}
		}
		bw.flush();
		bw.close();
	}

}
