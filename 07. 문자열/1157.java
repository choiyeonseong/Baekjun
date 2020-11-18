import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();

		int[] arr = new int[26];

		for (int i = 0; i < S.length(); i++) {

			int index = S.charAt(i);

			// 대문자 65~90
			// 소문자 97~122
			if (index > 90)
				index -= 32; // 소문자를 대문자로 바꿈

			arr[index - 65]++;
		}

		int max = -1;
		char ch = '?';
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max)
				ch = '?';
		}

		System.out.println(ch);

		br.close();

	}

}
