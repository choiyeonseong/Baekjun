import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int A=input.nextInt();
		int B=input.nextInt();
		input.close();
		
		System.out.println(A-B);
	}
}
