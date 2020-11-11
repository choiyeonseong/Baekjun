import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] array = new int[9];
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) { //같은 반복문 두번 써서 계속 틀림ㅠㅠ
			array[i] = Integer.parseInt(br.readLine());
			if (max < array[i]) {
				max = array[i];
				index = i+1;
			}
		}

		bw.write(String.format("%d\n%d", max, index));

		bw.flush();
		bw.close();
		br.close();
	}
}
