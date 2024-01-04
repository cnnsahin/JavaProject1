package JavaProject1;

public class Q7WordCounter {
    /*
    Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.
     */
    public static void main(String[] args) {
        String str  = "Hello, world!";
        int wordCount;
        wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) {
        str= str.trim();
        if (str.isEmpty()){
            return 0;
    }
         String[] words= str.split("\\s+");
        return words.length;

}
}
