import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int A=input.nextInt();
		int B=input.nextInt();
		input.close();
		
		System.out.println(A*((B%10)/1));
		System.out.println(A*((B%100)/10));
		System.out.println(A*((B%1000)/100));
		System.out.println(A*B);
		}
}
