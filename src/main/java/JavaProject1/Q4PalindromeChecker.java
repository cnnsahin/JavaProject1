package JavaProject1;

public class Q4PalindromeChecker {
    /*
    Check if a String is Palindrome: Determine whether a given string is a
    palindrome, which means it reads the same forwards and backward. For
    example, "madam" is a palindrome.
     */
    public static void main(String[] args) {
        String s = "madam";

        if (isPalindrome(s)) {
            System.out.println(s + " is a palindrome");
        }else {
            System.out.println(s + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);


    }
}
