package collections.optionalTask;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WorkWithIncreaseStrings {
    public static void main(String[] args) throws IOException {
        TreeMap<Integer, String> mapForSortStringsFromPoem = putStringsAndLengthInTreeMap(getDividedTextFromUserOnStrings());
        getTextFileWithIncreasingStringsLength(mapForSortStringsFromPoem);
    }

    public static List<String> getDividedTextFromUserOnStrings() throws IOException {
        List<String> listOfStringsFromUsersText = new ArrayList<>();
        FileReader fileReader = new FileReader("Romeo and Juliet.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!(line.length() == 0)) {
                listOfStringsFromUsersText.add(line);
            }
        }
        fileReader.close();
        return listOfStringsFromUsersText;
    }

    public static TreeMap<Integer, String> putStringsAndLengthInTreeMap(List<String> arrayList) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (String string : arrayList) {
            treeMap.put(string.length(), string);
        }
        return treeMap;
    }

    public static void getTextFileWithIncreasingStringsLength(TreeMap<Integer, String> treeMap) throws IOException {
        FileWriter writer = new FileWriter("Increasing Strings in Romeo and Juliet.txt");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            writer.write(entry.getValue() + System.getProperty("line.separator"));
        }
        writer.close();
    }
}
