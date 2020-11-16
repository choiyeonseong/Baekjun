import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int count = 0; // 연속 O
			int sum = 0; // 점수 합산

			//getByte - byte단위로 배열 반환
			for (byte value : br.readLine().getBytes()) {//한줄을 입력받은 문자열을 byte형 배열로 반환
				if (value == 'O') {
					count++;
					sum += count;
				} else
					count = 0;
			}
			bw.write(String.valueOf(sum) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
