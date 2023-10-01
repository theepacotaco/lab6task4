import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Measurement Converter!");
        System.out.print("Enter a measurement in meters: ");

        if (scanner.hasNextDouble()) {
            double meters = scanner.nextDouble();

            if (meters < 0) {
                System.out.println("Invalid input. Measurement must be a non-negative value.");
            } else {
                // Conversion factors
                double metersToMiles = 0.000621371;
                double metersToFeet = 3.28084;
                double metersToInches = 39.3701;

                // Perform conversions
                double miles = meters * metersToMiles;
                double feet = meters * metersToFeet;
                double inches = meters * metersToInches;

                System.out.println("Measurement in Miles: " + miles);
                System.out.println("Measurement in Feet: " + feet);
                System.out.println("Measurement in Inches: " + inches);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid numeric measurement in meters.");
        }

        scanner.close();
    }
}
