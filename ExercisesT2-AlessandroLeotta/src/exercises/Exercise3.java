package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int foodAmount, animals;
		double foodKg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce the amount of animals that are being fed in the barn: ");
		animals = sc.nextInt();
		System.out.println("Introduce the amount of food in units that are being consumed by the animals: ");
		foodAmount = sc.nextInt();
		System.out.println("Introduce the food kilograms that are bought: ");
		foodKg = sc.nextDouble();
		sc.close();
	}
}
