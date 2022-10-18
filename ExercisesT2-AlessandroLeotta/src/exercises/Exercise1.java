package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int x; //Declaration of variables
		int uOperation, dOperation, cOperation, tOperation;
		Scanner sc = new Scanner(System.in); //Declaration of scanner
		System.out.println("Type in a number from 0 to 9999: ");
		x = sc.nextInt();
		uOperation = (x % 10);
		dOperation = (x / 10) % 10;
		cOperation = (x / 100) % 10;
		tOperation = (x / 1000) % 10;
		if (x >= 0 && x <= 9999) {
			System.out.println("");
			System.out.println("Checking both ends of the number...");
		} else {
			System.out.println("");
			System.out.print("The following number: " + x + ", is not in the requested range (from 0 to 9999).");
			System.out.println("");
		}
		if (x >= 0 && x <= 9) {
			System.out.println("");
			System.out.println("The following number: " + x + ", is automatically equal on both ends for being one digit.");
		} else if (x >= 10 && x <= 99) {
			if (uOperation == dOperation) {
				System.out.println("");
				System.out.println("The following number: " + x + ", is equal on both ends.");
			} else {
				System.out.println("");
				System.out.println("The following number: " + x + ", is NOT equal on both ends.");
			}
		} else if (x >= 100 && x <= 999) {
			if (uOperation == cOperation) {
				System.out.println("");
				System.out.println("The following number: " + x + ", is equal on both ends.");
			} else {
				System.out.println("");
				System.out.println("The following number: " + x + ", is NOT equal on both ends.");
			}
		} else if (x >= 1000 && x <= 9999) {
			if ((uOperation == tOperation) && (dOperation == cOperation)) {
				System.out.println("");
				System.out.println("The following number: " + x + ", is equal on both ends.");
			} else {
				System.out.println("");
				System.out.println("The following number: " + x + ", is NOT equal on both ends.");
			}
		}
		System.out.println("");
		System.out.println("Have a nice day!");
		sc.close(); //Closing scanner
	}
}
