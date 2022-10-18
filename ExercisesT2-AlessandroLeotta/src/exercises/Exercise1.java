package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int x; //Declaration of variable
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Type in a number from 0 to 9999: ");
		x = sc.nextInt();
		if (x >= 0 && x <= 9999) {
			System.out.println("Checking both ends of the number...");
		} else {
			System.out.print("The following number: " + x + ", is not in the requested range (from 0 to 9999).");
		}
		
		sc.close(); //Closing scanner
	}
}
