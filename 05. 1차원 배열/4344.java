import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int C = Integer.parseInt(br.readLine()); // test_case

		for (int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());// 학생 수
			int[] arr = new int[N];
			int sum = 0;
			for (int j = 0; j < N; j++) {

				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			int average = sum / N;
			int count = 0;
			for (int j = 0; j < N; j++) {
				if (arr[j] > average)
					count++;
			}
			
			double result=(double) count / (double) N*100;
			bw.write(String.format("%.3f%%\n",result));

		}

		bw.flush();
		bw.close();
		br.close();
	}
}
