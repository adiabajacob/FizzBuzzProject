package org.jacob;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = getValidIntegerInput(scanner);

        String result = fizzBuzz(userInput);
        System.out.println(result);
    }


    public static String fizzBuzz(int number) {
        if ((number % 5 == 0) && (number % 3 == 0)) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Fizz";
        } else if (number % 3 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }


    private static int getValidIntegerInput(Scanner scanner) {
        int userInput = 0;
        while (true) {
            try {
                userInput = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
        return userInput;
    }
}
