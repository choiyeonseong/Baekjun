import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken());// A 고정비용
		int B = Integer.parseInt(st.nextToken());// B 가변비용
		int C = Integer.parseInt(st.nextToken());// C 노트북 가격

		int k = 0; // k 손익분기점 C*k>A+B*k -> 존재하지 않으면 -1
					// k=A/(C-B)

		if (C <= B)
			k = -1; // 이익이 생기지 않으면 -1
		else
			k = (A / (C - B)) + 1;


//		 int k = (B<C) ? (A/(C-B))+1 : -1;	

		bw.write(String.valueOf(k));

		bw.flush();
		bw.close();
		br.close();

	}

}
