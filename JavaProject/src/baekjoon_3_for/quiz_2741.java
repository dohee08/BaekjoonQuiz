package baekjoon_3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quiz_2741 {
	/** Buffer 이용 **/
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		for(int i=1; i<=n; i++) {
			bw.write(i+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
	
	/** Scanner 이용 **/
	/*public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}

	}

}*/
