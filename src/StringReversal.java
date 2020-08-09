import java.util.Scanner;

class StringReversal {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your string: ");
		String s = scan.nextLine();
		StringReversal obj = new StringReversal();
		obj.reverseString(s);
	}  
	
	void reverseString(String s) {
		if ((s == null)||(s.length() <= 1)) {
			System.out.println(s);
		} else {
			System.out.print(s.charAt(s.length()-1));
			reverseString(s.substring(0,s.length()-1));
		}
	}
}