import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

		System.out.println(A > B ? A : B);

		br.close();
	}
}

/*StringBuffer vs StringBuilder
 * 동기화의 유무
 * builder는 동기화 지원하지않음 - 단일쓰레드에서 성능이 뛰어남
 * buffer은 동기화 키워드 지원 - 멀티쓰레드 환경에서 안전(string도 안전)*/

/*
 * String : 문자열 연산이 적고 멀티쓰레드 환경일 경우
 * StringBuffer : 문자열 연산이 많고 멀티쓰레드 환경일 경우
 * StringBuilder : 문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우*/
 
