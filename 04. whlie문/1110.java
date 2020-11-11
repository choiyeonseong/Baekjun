import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int cycle = 0;
		int newN = N;

		while (true) {
			int ten = unitsPlace(newN);
			int unit = unitsPlace(tensPlace(newN) + unitsPlace(newN));

			newN = ten * 10 + unit;
			cycle++;
			if(newN==N) break;
		}

		bw.write(String.valueOf(cycle));

		bw.flush();
		bw.close();
		br.close();
	}

	// Method
	private static int unitsPlace(int N) {
		return N % 10;
	}

	private static int tensPlace(int N) {
		return N / 10;
	}
}
