package LW_03;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temp = new Temperature();

        System.out.print("Enter temperature in Celsius: ");
        double input = scanner.nextDouble();

        temp.setCelsius(input);
        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());
    }
}