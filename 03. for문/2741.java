import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());	
		br.close();
		for (int i = 0; i < T; i++) {
		
			bw.write(i+1 + "\n");
		}
		bw.flush();	
		

		bw.close();

	}
}
