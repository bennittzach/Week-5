import java.io.*;

public class UserStrings {
	public static void main(String[] args) throws IOException {
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("userStrings.txt"));

		System.out.println("Please enter your string, enter DONE to end: ");

		int x = 1;
		while (x > 0) {
			s = br.readLine();
			if (s.contentEquals("DONE")) {
				break;
			} else {
				x++; 
			}

		bw.write(s);
		bw.newLine();
		}
		bw.close();
	}
}