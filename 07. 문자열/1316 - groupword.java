import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int count = 0;// 그룹단어 개수

		for (int i = 0; i < N; i++) {
			if(isGroupword(br.readLine())==true)
				count++;
		}

		bw.write(String.valueOf(count));

		bw.flush();
		bw.close();
		br.close();
	}
	
	//그룹단어인지 아닌지
	public static boolean isGroupword(String str) {
		boolean[] isUsed = new boolean[26]; // 알파벳
		int prev = 0; // 이전 문자

		for (int i = 0; i < str.length(); i++) {

			int now = str.charAt(i);// 현재 문자

			// 1 비연속 문자인 경우
			if (prev != now) {
				// 1-1 해당문자가 처음 나오는 경우
				if (isUsed[now - 'a'] == false) {
					isUsed[now - 'a'] = true;// true로 바꾼다
					prev = now;
				}
				// 1-2 해당문자가 이미 나온적 있는 경우
				else {
					return false;	// 그룹단어가 아님
				}
				
			// 2 연속문자일 경우
			}else if(prev==now) continue;

		}
		
		return true;//그룹단어 임
	}
}
