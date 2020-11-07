import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());	//첫 라인

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());	//다음 토큰을 int로 형변환
			int B = Integer.parseInt(st.nextToken());
			int sum = A + B;

			bw.write(sum + "\n");
		}
		bw.flush();	//스트림을 비움
		
		br.close();
		bw.close();

	}
}
