package LW_03;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temp = new Temperature();

        System.out.print("Enter temperature in Fahrenheit: ");
        double input = scanner.nextDouble();

        temp.setFahrenheit(input);
        System.out.println("Temperature in Celsius: " + temp.toCelsius());
    }
}