import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.print("Enter temperature value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter unit (C/F/K): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                convertFromCelsius(value);
                break;
            case 'F':
                convertFromFahrenheit(value);
                break;
            case 'K':
                convertFromKelvin(value);
                break;
            default:
                System.out.println("Invalid unit! Please enter C, F, or K.");
        }

        scanner.close();
    }

    public static void convertFromCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;
        System.out.println("From Celsius:");
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);
    }

    public static void convertFromFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        double kelvin = celsius + 273.15;
        System.out.println("From Fahrenheit:");
        System.out.printf("Celsius: %.2f °C%n", celsius);
        System.out.printf("Kelvin: %.2f K%n", kelvin);
    }

    public static void convertFromKelvin(double kelvin) {
        double celsius = kelvin - 273.15;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("From Kelvin:");
        System.out.printf("Celsius: %.2f °C%n", celsius);
        System.out.printf("Fahrenheit: %.2f °F%n", fahrenheit);
    }
}
