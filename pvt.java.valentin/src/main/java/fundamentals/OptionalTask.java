package fundamentals;

import java.util.Scanner;

public class OptionalTask {
    public static void main(String[] args) {
        String[] arrayOfNumbers = getArrayWithNumbersFromUser();
        printArray(arrayOfNumbers);
        printShortestNumberAndItLength(arrayOfNumbers);
        printLongestNumberAndItLength(arrayOfNumbers);
        int lengthOfAllNumbers = getSumOfLengthAllNumbersInArray(arrayOfNumbers);
        System.out.println("Length of ALL numbers: " + lengthOfAllNumbers);
        int averageLengthOfNumbers = getAverageLengthOfNumberInArray(lengthOfAllNumbers, arrayOfNumbers);
        System.out.println("Average length of ALL numbers: " + averageLengthOfNumbers);
        printNumbersWithLengthLessOrEqualThanAverageLength(arrayOfNumbers, averageLengthOfNumbers);
        printNumbersWithLengthMoreThanAverageLength(arrayOfNumbers, averageLengthOfNumbers);
    }

    public static String[] getArrayWithNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much numbers do you want enter?");
        int arrayDimension = scanner.nextInt();
        String[] arrayOfNumbers = new String[arrayDimension];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Scanner numberForArrayFromKeyboard = new Scanner(System.in);
            System.out.println("Please, enter " + (i + 1) + " number");
            arrayOfNumbers[i] = numberForArrayFromKeyboard.next();
        }
        return arrayOfNumbers;
    }

    public static void printArray(String[] arrayOfNumbers) {
        for (String number : arrayOfNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    public static void printShortestNumberAndItLength(String[] arrayOfNumbers) {
        String[] arrayWithShortestNumber = new String[1];
        int initialElement = arrayOfNumbers[0].length();
        arrayWithShortestNumber[0] = arrayOfNumbers[0];
        for (int i = 0; i <= arrayOfNumbers.length - 1; i++) {
            int currentNumber = arrayOfNumbers[i].length();
            if (currentNumber < initialElement) {
                arrayWithShortestNumber[0] = arrayOfNumbers[i];
            }
        }
        System.out.println("Shortest number: " + arrayWithShortestNumber[0]);
        System.out.println("Length of shortest number: " + arrayWithShortestNumber[0].length());
        System.out.println("");
    }

    public static void printLongestNumberAndItLength(String[] arrayOfNumbers) {
        String[] arrayWithLongestNumber = new String[1];
        int initialElement = arrayOfNumbers[0].length();
        arrayWithLongestNumber[0] = arrayOfNumbers[0];
        for (int i = 0; i <= arrayOfNumbers.length - 1; i++) {
            int currentNumber = arrayOfNumbers[i].length();
            if (currentNumber > initialElement) {
                arrayWithLongestNumber[0] = arrayOfNumbers[i];
            }
        }
        System.out.println("Longest number: " + arrayWithLongestNumber[0]);
        System.out.println("Length of longest number: " + arrayWithLongestNumber[0].length());
        System.out.println("");
    }

    public static int getSumOfLengthAllNumbersInArray(String[] arrayOfNumbers) {
        int lengthOfAllNumbers = 0;
        for (String number : arrayOfNumbers) {
            lengthOfAllNumbers = lengthOfAllNumbers + number.length();
        }
        return lengthOfAllNumbers;
    }

    public static int getAverageLengthOfNumberInArray(int lengthOfAllNumbers, String[] arrayOfNumbers) {
        int averageLengthOfNumbers = 0;
        averageLengthOfNumbers = lengthOfAllNumbers / arrayOfNumbers.length;
        return averageLengthOfNumbers;
    }

    public static void printNumbersWithLengthLessOrEqualThanAverageLength(String[] arrayOfNumbers, int averageLengthOfNumbers) {
        System.out.println("Numbers with length less or equal than average length: ");
        for (String arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber.length() <= averageLengthOfNumbers) {
                System.out.print(arrayOfNumber + ", length of number: " + arrayOfNumber.length() + "; ");
            }
        }
        System.out.println("");
    }

    public static void printNumbersWithLengthMoreThanAverageLength(String[] arrayOfNumbers, int averageLengthOfNumbers) {
        System.out.println("Numbers with length more than average length: ");
        for (String arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber.length() > averageLengthOfNumbers) {
                System.out.print(arrayOfNumber + ", length of number " + arrayOfNumber.length() + "; ");
            }
        }
        System.out.println("");
    }
}
