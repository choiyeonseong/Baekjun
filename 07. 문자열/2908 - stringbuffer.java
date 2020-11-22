import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String str = st.nextToken();

		//StringBuffer 자료형은 String 자료형보다 무거움
		//StringBuffer은 문자열추가나 변경등 작업이 많을때 사용
		//String은 +될때마다 새로운 메모리영역을 가리킴 -> 변하지 않는 문자열을 읽을때
		//StringBuffer은 하나의 메모리에서 추가
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(str);
		int A = Integer.parseInt(strBuffer.reverse().toString());

		str = st.nextToken();

		strBuffer = new StringBuffer();
		strBuffer.append(str);
		int B = Integer.parseInt(strBuffer.reverse().toString());

		if (A > B)
			System.out.println(A);
		else
			System.out.println(B);

		br.close();
	}
}
