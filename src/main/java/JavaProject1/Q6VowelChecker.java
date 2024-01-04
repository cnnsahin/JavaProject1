package JavaProject1;

public class Q6VowelChecker {
    /*
    Create a method to count how many vowels are present in a string
     “documentation”
     */
    public static void main(String[] args) {
        String str = "documentation";

        int vowelCount = countVowels(str);

        System.out.println("Number of vowels in  " + str + " : " + vowelCount);
    }

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }


}

