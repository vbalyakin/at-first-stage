package fundamentals;

import java.util.Scanner;

public class ArrayMathematician {
    public static void main(String[] args) {
        int[] arrayFromUser = getArrayWithNumbersFromUser();
        printUsersNumbers(arrayFromUser);
        System.out.println(getSumOfAllNumbersInArray(arrayFromUser));
        System.out.println(getMultiplyOfAllNumbersInArray(arrayFromUser));
    }

    public static int[] getArrayWithNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want enter?");
        int arrayDimension = scanner.nextInt();
        int[] arrayOfNumbers = new int[arrayDimension];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Scanner numberForArrayFromKeyboard = new Scanner(System.in);
            System.out.println("Please, enter " + (i + 1) + " number");
            arrayOfNumbers[i] = numberForArrayFromKeyboard.nextInt();
        }
        return arrayOfNumbers;
    }

    public static void printUsersNumbers(int[] arrayOfNumbers) {
        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.print(arrayOfNumber + " ");
        }
        System.out.println("");
    }

    public static int getSumOfAllNumbersInArray(int[] arrayOfNumbers) {
        int sumOfEnteredNumbers = 0;
        for (int arrayOfNumber : arrayOfNumbers) {
            sumOfEnteredNumbers = sumOfEnteredNumbers + arrayOfNumber;
        }
        return sumOfEnteredNumbers;
    }

    public static int getMultiplyOfAllNumbersInArray(int[] arrayOfNumbers) {
        int multiplicationOfEnteredNumbers = 1;
        for (int arrayOfNumber : arrayOfNumbers) {
            multiplicationOfEnteredNumbers *= arrayOfNumber;
        }
        return multiplicationOfEnteredNumbers;
    }
}
