package fundamentals;

import java.util.Scanner;

public class ArrayPrinter {
    public static void main(String[] args) {
        int[] arrayWithNumbersFromUser = getArrayWithNumbersFromUser();
        printArrayInDirectOrder(arrayWithNumbersFromUser);
        printArrayInReverseOrder(arrayWithNumbersFromUser);
    }

    public static int[] getArrayWithNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What QUANTITY of numbers (from 1 to 10) do you want to enter?");
        int numbersOfVariablesFromKeyboard = scanner.nextInt();
        int[] arrayOfNumbers = new int[numbersOfVariablesFromKeyboard];
        for (int i = 1; i <= numbersOfVariablesFromKeyboard; i++) {
            System.out.println("Please, enter " + i + " number");
            Scanner numberFromKeyboardForArray = new Scanner(System.in);
            int numberForArray = numberFromKeyboardForArray.nextInt();
            arrayOfNumbers[i - 1] = numberForArray;
        }
        return arrayOfNumbers;
    }

    public static void printArrayInDirectOrder(int[] arrayOfNumbers) {
        for (int number : arrayOfNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    public static void printArrayInReverseOrder(int[] arrayOfNumbers) {
        for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}
