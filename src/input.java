import java.util.Scanner;
import java.io.*;
public class input {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("input.csv"));
		String line = "";

		int max = 0, count = 1;
		String[] iArray = null;
		System.out.println("Maximum values");
		while(scan.hasNext()) {
			line = scan.nextLine();
			iArray = line.split(",");
			max = 0;
			for(int x = 0; x < iArray.length; x++) {
				if (Integer.parseInt(iArray[x]) > max) {
					max = Integer.parseInt(iArray[x]);
				}
			}
			System.out.println("ROW " + count + ": " + max);
			count++;
		}
	}
}