//runtime-error
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			count++;
			
			switch (str.charAt(i)) {
			case 'c':
				if (i < str.length() - 1 & str.charAt(i + 1) == '=' | str.charAt(i + 1) == '-') {
					i++;
					break;
				}
			case 'd':
				if (i < str.length() - 1 & str.charAt(i + 1) == '-') {
					i++;
					break;
				} else if (i < str.length() - 2 & (str.charAt(i + 1) == 'z' & str.charAt(i + 2) == '=')) {
					i += 2;
					break;
				}
			case 'l':
			case 'n':
				if (i < str.length() - 1 & str.charAt(i + 1) == 'j') {
					i++;
					break;
				}
			case 's':
			case 'z':
				if (i < str.length() - 1 & str.charAt(i + 1) == '=') {
					i++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
