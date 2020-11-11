import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());

		int[] array = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		int min = array[0], max = array[0];

		for (int i = 0; i < N; i++) {
			min=Math.min(min, array[i]);  //라이브러리함수쓰는게 더 오래 걸림(미세한 )
			max=Math.max(max, array[i]);
		}

		bw.write(String.format("%d %d", min, max));
	
		bw.flush();
		bw.close();
		br.close();
	}
}
