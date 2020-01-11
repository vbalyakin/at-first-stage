package collections.optionalTask;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkWithReverseText {
    public static void main(String[] args) throws IOException {
        getTextFileInReverseOrder(getDividedTextFromUserOnStrings());
    }

    public static List<String> getDividedTextFromUserOnStrings() throws IOException {
        List<String> listOfStringsFromUsersText = new ArrayList<>();
        FileReader fileReader = new FileReader("Romeo and Juliet.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            listOfStringsFromUsersText.add(line);
        }
        fileReader.close();
        return listOfStringsFromUsersText;
    }

    public static void getTextFileInReverseOrder(List<String> arrayList) throws IOException {
        int sizeOfArrayList = arrayList.size() - 1;
        FileWriter writer = new FileWriter("Reverse Romeo and Juliet.txt");
        for (int i = sizeOfArrayList; i >= 0; i--) {
            writer.write(arrayList.get(i) + System.getProperty("line.separator"));
        }
        writer.close();
    }
}
