package fundamentals;

import java.util.Scanner;

public class MonthSelector {
    public static void main(String[] args) {
        String[] monthNames = {"Stub", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter No of month:");
        int numberOfMonthForSystem = scanner.nextInt();
        if (numberOfMonthForSystem <= 0 || numberOfMonthForSystem > 12) {
            System.out.println("Sorry, no month exists with this number. Please enter a valid month number");
        } else {
            System.out.println("Month number corresponding to the entered number: " + monthNames[numberOfMonthForSystem]);
        }
    }
}
