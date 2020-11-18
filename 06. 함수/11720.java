import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum = 0;

		for (int i = 0; i < N; i++) {
			// charAt(index)은 string에서 각 index의 값을 아스키코드 값으로 반환
			// charAt()은 해당문자의 아스키 코드 값을 반환, 반드시 -48 또는 -'0'
			sum += num.charAt(i) - '0';
		}
		bw.write(String.valueOf(sum));

		br.close();
		bw.flush();
		bw.close();

	}

}
