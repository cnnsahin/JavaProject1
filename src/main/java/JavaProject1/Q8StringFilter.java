package JavaProject1;

import java.util.ArrayList;
import java.util.List;

public class Q8StringFilter {
    /*
    You have a list of strings and you want to keep only those that start with
     “A” and you want to return them in lower case".
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Abercrombie");
        stringList.add("Zara");
        stringList.add("Mango");
        stringList.add("Anthroplogie");
        stringList.add("AmericanEagle");
        List<String> filteredList = filterStringsStartingWithA(stringList);
        for (String str : filteredList) {
            System.out.println(str.toLowerCase());
        }
    }
    public static List<String> filterStringsStartingWithA(List<String> stringList) {
        List<String> filteredList = new ArrayList<>();
        for (String str : stringList) {
            if (str.startsWith("A")) {

        filteredList.add(str);
            }
        }
        return filteredList;


    }



}
