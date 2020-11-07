import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double A=input.nextDouble();
		double B=input.nextDouble();
		input.close();
		
		System.out.println(A/B);
	}
}
