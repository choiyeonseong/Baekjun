import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean[] arr = new boolean[42];
		// 0~41까지 해당하는 숫자 true 표시
		for (int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}

		int count = 0;

		for (boolean value : arr) {
			if (value)
				count++;
		}
		bw.write(String.valueOf(count));

		bw.flush();
		bw.close();
		br.close();
	}
}
