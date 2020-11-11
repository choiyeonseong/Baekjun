import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A= Integer.parseInt(br.readLine());
		int B= Integer.parseInt(br.readLine());
		int C= Integer.parseInt(br.readLine());
		int Total=A*B*C;
		String str=Integer.toString(Total);
		
		for (int i = 0; i < 10; i++) {
			int count=0;
			for(int j=0;j<str.length();j++) {
				if ((str.charAt(j)-'0')==i) {     //charAt(index) : index번째 문자
					count++;
				}
			}
			bw.write(String.valueOf(count)+"\n");
		}

		
		bw.flush();
		bw.close();
		br.close();
	}
}
