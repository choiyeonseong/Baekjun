import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(hansu(Integer.parseInt(br.readLine())));

	}

	// 한수 (1,2자리 숫자는 모두 등차수열, 3자리 숫자만 판별)
	public static int hansu(int n) {

		int hansu = 0;// 한수의 개수

		// 1,2자리 숫자는 모두 등차수열(=한수)
		if (n < 100) {
			return n;

		} else { // 3자리 숫자부터
			hansu = 99;// 100이상이면 한수의 최소개수는 99개
			if (n == 1000)
				n = 999;// 1000일 경우 예외처리

			for (int i = 100; i <= n; i++) {// 100~n까지의 숫자 중
				int hun = i / 100; // 100의 자리수
				int ten = (i / 10) % 10; // 10의 자리수
				int one = i % 10; // 1의 자리수

				if ((hun - ten) == (ten - one))
					hansu++;
			}
			return hansu;
		}

	}

}
