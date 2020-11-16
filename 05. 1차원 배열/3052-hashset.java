import java.io.*;
import java.util.HashSet;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// hashset - 중복원소 허용x, 순서개념없음 정렬하고싶으면 리스트로 변환후 정렬,
		// 원소의 개수는 hashset의 사이즈

		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
		}

		bw.write(String.valueOf(h.size()));

		bw.flush();
		bw.close();
		br.close();
	}
}
