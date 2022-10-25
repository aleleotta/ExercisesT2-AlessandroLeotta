package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int animals;
		double boughtFood; //double, float = 2.3, 5.4, 3673.5. int= 3, 6, 10, 0, -1, -4, 3.14
		double foodKg;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce the number of animals that are being fed in the barn: ");
		animals = sc.nextInt();
		System.out.println("Introduce the amount of food in kilograms that has been bought: ");
		foodKg = sc.nextDouble();
		System.out.println("Introduce the amount of food in kilograms that is needed to feed each animal: ");
		boughtFood = sc.nextDouble();
		result = foodKg * (boughtFood/animals); //(animals*foodKg) / boughtFood
		if (boughtFood >= foodKg) {
			System.out.println("There is enough food for all animals. Amount of food per animal: " + result + "kg");
		} else if (boughtFood < foodKg) {
			System.out.println("The food units are gonna have to be split in rations to distribute it equally per animal. Amount of food per animal: " + result + "kg");
		} 
		sc.close();
	}
}