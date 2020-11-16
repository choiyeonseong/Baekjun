import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());// 시험 본 과목 개수

	  double[] arr = new double[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			
			arr[i] = Double.parseDouble(st.nextToken());
		}

		Arrays.sort(arr);
		double M = arr[arr.length - 1];
		double total_score = 0;
		for (int i = 0; i < N; i++) {
			total_score += arr[i] / M * 100;
		}

		bw.write(String.valueOf(total_score / N));

		bw.flush();
		bw.close();
		br.close();
	}
}
