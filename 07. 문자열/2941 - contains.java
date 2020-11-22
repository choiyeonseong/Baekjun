import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] croabc = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		String str = br.readLine();

		for (int i = 0; i < croabc.length; i++) {
			//contains() : 대상 문자열에 특정 문자열이 포함되어있는지 확인하는 함수(대/소문자 구별)
			if (str.contains(croabc[i])) {
				//크로아티아 알파벳을 *로 치환
				//ex) replace(특수문자로도 치환 가능), replaceAll(특수문자로 치환 어려움), replaceFirst(처음으로 해당할때만 치환)
				str = str.replaceAll(croabc[i], "*");
			}
		}

		bw.write(String.valueOf(str.length()));

		bw.flush();
		bw.close();
		br.close();
	}
}
