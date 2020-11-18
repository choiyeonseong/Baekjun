import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 소문자(97~122)
		String S = br.readLine();

		int[] arr = new int[26];

		// 배열을 -1로 초기화
		Arrays.fill(arr, -1);

		for (int i = 0; i < S.length(); i++) {
			int index = S.charAt(i); // 97~122

			if (arr[index - 97] == -1)
				arr[index - 97] = i;

		}

		for (int value : arr) {
			bw.write(value + " ");
		}

		br.close();
		bw.flush();
		bw.close();

	}

}
