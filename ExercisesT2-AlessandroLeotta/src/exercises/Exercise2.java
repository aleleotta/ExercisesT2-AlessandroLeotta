package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int dni;
		char letter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce your DNI: ");
		dni = sc.nextInt();
		if (dni <= 99999999 && dni >= 10000000) {
			System.out.println("Searching for final letter...");
			System.out.println("");
			switch (dni % 23) {
				case 0 -> {
					letter = 'T';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 1 -> {
					letter = 'R';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 2 -> {
					letter = 'W';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 3 -> {
					letter = 'A';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 4 -> {
					letter = 'G';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 5 -> {
					letter = 'M';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 6 -> {
					letter = 'Y';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 7 -> {
					letter = 'F';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 8 -> {
					letter = 'P';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 9 -> {
					letter = 'D';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 10 -> {
					letter = 'X';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 11 -> {
					letter = 'B';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 12 -> {
					letter = 'N';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 13 -> {
					letter = 'J';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 14 -> {
					letter = 'Z';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 15 -> {
					letter = 'S';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 16 -> {
					letter = 'Q';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 17 -> {
					letter = 'V';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 18 -> {
					letter = 'H';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 19 -> {
					letter = 'L';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 20 -> {
					letter = 'C';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 21 -> {
					letter = 'K';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				case 22 -> {
					letter = 'E';
					System.out.println("Your DNI is: " + dni + "-" + letter);
				}
				default -> {
					System.out.println("Invalid.");
				}
			}
		} else {
			System.out.println("You haven´t introduced a valid number.");
		}
		sc.close();
	}
}