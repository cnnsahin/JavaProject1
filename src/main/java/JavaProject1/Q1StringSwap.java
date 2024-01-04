package JavaProject1;

public class Q1StringSwap {
    /*
   Write a program to swap 2 String without a temporary variable?
    */
    public static void main(String[] args) {
        String a = "Imagine";
        String b = "all the people";

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = new StringBuilder(a).append(b).toString();
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

