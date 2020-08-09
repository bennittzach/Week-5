import java.util.Scanner;

public class DivisorCalc {
	
	public static int gcd(int num1, int num2) {
		if (num2 <= num1 && num2 / num1 == 0) {
			return num2;
		} else { if (num1 < num2) {
			return gcd(num2, num1);
		} else {
			return gcd(num2, num1%num2);
		}
		}
	}
	
	public static void main(String[] args) {
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter first integer: ");
		num1 = (int)scan.nextInt();
		while (num1 < 0) {
			System.out.print("Please enter a positive integer: ");
			num1 = (int)scan.nextInt();
		}
		System.out.print("Please enter second integer: ");
		num2 = (int)scan.nextInt();
		while (num2 < 0) {
			System.out.print("Please enter a positive integer: ");
			num2 = (int)scan.nextInt();
		}
		
		int g;
		g = gcd(num1, num2);
		System.out.println("The GCD of " +num1+ " and " +num2+ " = " +g);
		scan.close();
	}
}