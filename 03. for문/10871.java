import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {

			int value = Integer.parseInt(st.nextToken());

			if (value < X)
				bw.write(value+" ");

		}
		bw.flush();

		bw.close();
		br.close();
	}
}
