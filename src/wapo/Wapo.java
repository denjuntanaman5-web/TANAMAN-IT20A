
package wapo;

import java.util.Scanner;


public class Wapo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Input the third number: ");
        double num3 = scanner.nextDouble();

        double greatest = Math.max(num1, Math.max(num2, num3));

        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}