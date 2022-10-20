package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int animals;
		double foodUnits;
		double foodKg = 1.0;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce the amount of animals that are being fed in the barn: ");
		animals = sc.nextInt();
		System.out.println("Introduce the food kilograms that are consumed by the animals: ");
		foodKg = sc.nextDouble();
		System.out.println("Introduce the food units that are needed to feed all animals: ");
		foodUnits = sc.nextDouble();
		result = foodKg / animals;
		if (foodKg >= animals) {
			System.out.println("There is enough food for all animals. Amount of food per animal: " + result + "kg");
		} else if (foodKg < animals) {
			System.out.println("The food units are gonna have to be split in rations to distribute it equally per animal. Amount of food per animal: " + result + "kg");
		}
		sc.close();
	}
}