package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int num;
		String text0, text1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number: ");
		num = sc.nextInt();
		if (num >= 0 && num <= 99) {
			
		} else {
			System.out.println("The introduced number is not valid.");
		}
		sc.close();
	}
}
