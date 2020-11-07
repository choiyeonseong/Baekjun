import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int H = input.nextInt();
		int M = input.nextInt();
		input.close();

		if (M < 45) {
			H--;
			M = (M + 60) - 45;
			if (H < 0) {
				H = 23;
			}
			System.out.printf("%d %d", H, M);
		} else
			System.out.printf("%d %d", H, M - 45);
	}
}
