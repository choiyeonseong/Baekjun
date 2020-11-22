import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String str;

		int count = 0;// 그룹단어 개수

		for (int i = 0; i < N; i++) {
			int[] countUsed = new int[26]; // 알파벳
			for (int j = 0; j < 26; j++) {
				countUsed[j] = 1; // 사용 안한 상태 = 1
									// 한번 사용 = 0
									// 두번 사용 = -1
			}

			str = br.readLine();

			countUsed[str.charAt(0) - 'a'] -= 1; // 첫 문자는 사용됨

			for (int j = 0; j < str.length() - 1; j++) {
				int prev = str.charAt(j);
				int now = str.charAt(j + 1);

				// 1 비연속 문자인 경우
				if (prev != now) {
					countUsed[now - 'a'] -= 1;

				} else
					continue;

			}
			// 그룹단어가 아닌 수를 카운트 해서 전체 문장 수에서 그룹단어가 아닌 수를 뺀다
			for (int j = 0; j < 26; j++) {
				// 한번이상 사용된 문자는 1 -> 0-> -1
				if (countUsed[j] < 0) {
					count++;
					break;
				}
			}

		}

		bw.write(String.valueOf(N - count));

		bw.flush();
		bw.close();
		br.close();

	}

}
