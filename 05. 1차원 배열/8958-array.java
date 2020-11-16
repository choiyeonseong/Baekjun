import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < N; i++) {
			int count = 0; // 연속 O
			int sum = 0; // 점수 합산

			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') { // O일때 연속점수
					count++;
				} else
					count = 0;
				sum += count;
			}
			bw.write(String.valueOf(sum) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
