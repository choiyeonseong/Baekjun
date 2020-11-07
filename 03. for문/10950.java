import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		int[] array = new int[T];
		int i;
		for (i = 0; i < T; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			array[i] = a + b;	//배열안넣고 바로 print하면 더 빨라
		}
		input.close();

		for (i = 0; i < T; i++) {
			System.out.println(array[i]);
		}
	}
}
