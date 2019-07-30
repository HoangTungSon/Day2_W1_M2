import java.util.Scanner;

public class FahrenheitToCelcius {

	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		int choice;

		System.out.println("Enter fahrenheit: ");
		fahrenheit = input.nextDouble();
		System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));

		System.out.println("Enter Celsius: ");
		celsius = input.nextDouble();
		System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));

	}
}
