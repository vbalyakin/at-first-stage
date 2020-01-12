package collections.optionalTask;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Sorter {
    public static void main(String[] args) throws IOException {
        List<String> stringsFromText = getDividedTextFromUserOnStrings();
        Collections.sort(stringsFromText);
        System.out.println("Sort by Collections class \n" + stringsFromText);
        TreeMap<Integer, String> mapWithStringsAndLengths = putStringsAndLengthInTreeMap(getDividedTextFromUserOnStrings());
        printLongestStringFromUserText(mapWithStringsAndLengths);
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

    public static void printLongestStringFromUserText(TreeMap<Integer, String> treeMap) {
        for (Integer value : treeMap.descendingKeySet()) {
            System.out.println("\nSort and find longest string in text" + "\nLength of the longest string: " + value + "\nThe contents of the string: " + treeMap.get(value));
            break;
        }
    }
}
