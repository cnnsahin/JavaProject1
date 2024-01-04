package JavaProject1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q10RemoveDuplicates {
    public static void main(String[] args) {
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("icecream");
        listWithDuplicates.add("candy");
        listWithDuplicates.add("water");
        listWithDuplicates.add("icecream");
        listWithDuplicates.add("candy");
        System.out.println("List with duplicates: " + listWithDuplicates);
        List<String> listWithoutDuplicates = new ArrayList<>();
        for (String element : listWithDuplicates) {
            if (!listWithoutDuplicates.contains(element)) {
                listWithoutDuplicates.add(element);
            }
        }
        System.out.println("List without duplicates: " + listWithoutDuplicates);

    }
}