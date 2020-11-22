import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine()); // 설탕 N

//5로 최대로 나눠어 보고 안나눠 질때마다 하나씩 줄여가며 3을 채워나가는 방식()
		int count = 0;

		while (true) {
			if (N % 5 == 0) {
				sb.append(N / 5 + count);
				break;
			} else if (N <= 0) {
				sb.append(-1);
				break;
			}

			N = N - 3;
			count++;
		}

		System.out.println(sb);

		br.close();

	}
}
