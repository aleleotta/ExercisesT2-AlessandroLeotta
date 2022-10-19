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
				}
				case 1 -> {
					letter = 'R';
				}
				case 2 -> {
					letter = 'W';
				}
				case 3 -> {
					letter = 'A';
				}
				case 4 -> {
					letter = 'G';
				}
				case 5 -> {
					letter = 'T';
				}
				case 6 -> {
					letter = 'M';
				}
				case 7 -> {
					letter = 'Y';
				}
				case 8 -> {
					letter = 'T';
				}
				case 9 -> {
					letter = 'T';
				}
				case 10 -> {
					letter = 'T';
				}
				case 11 -> {
					letter = 'T';
				}
				case 12 -> {
					letter = 'T';
				}
				case 13 -> {
					letter = 'T';
				}
				case 14 -> {
					letter = 'T';
				}
				case 15 -> {
					letter = 'T';
				}
				case 16 -> {
					letter = 'T';
				}
				case 17 -> {
					letter = 'T';
				}
				case 18 -> {
					letter = 'T';
				}
				case 19 -> {
					letter = 'T';
				}
				case 20 -> {
					letter = 'T';
				}
				case 21 -> {
					letter = 'T';
				}
				case 22 -> {
					letter = 'T';
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