import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int A=input.nextInt();
		int B=input.nextInt();
		int C=input.nextInt();
		input.close();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
		}
}