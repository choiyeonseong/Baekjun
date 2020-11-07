import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int test_Score=input.nextInt();
		input.close();
		
		if(90<=test_Score & test_Score<=100) System.out.println("A");
		else if(80<=test_Score & test_Score<90) System.out.println("B");
		else if(70<=test_Score & test_Score<80) System.out.println("C");
		else if(60<=test_Score & test_Score<70) System.out.println("D");
		else System.out.println("F");
		
		}
}
