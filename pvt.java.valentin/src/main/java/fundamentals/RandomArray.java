package fundamentals;

import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        printArrayInOneLine(randomArray);
        printArrayWithLineBreak(randomArray);
    }

    public static int[] getRandomArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to generate?");
        int arrayDimension = scanner.nextInt();
        int[] arrayFromRandomMethod = new int[arrayDimension];
        System.out.println("Array generation ...");
        int step = 50;
        for (int i = 0; i < arrayFromRandomMethod.length; i++) {
            arrayFromRandomMethod[i] = (int) (Math.random() * step);
        }
        return arrayFromRandomMethod;
    }

    public static void printArrayInOneLine(int[] arrayFromRandomMethod) {
        for (int value : arrayFromRandomMethod) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }

    public static void printArrayWithLineBreak(int[] arrayFromRandomMethod) {
        for (int value : arrayFromRandomMethod) {
            System.out.println(value);
        }
    }
}
