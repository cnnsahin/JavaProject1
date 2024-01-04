package JavaProject1;

public class Q2AlphaCharacterCount {
    public static void main(String[] args) {
        String myString = " Happy New Year countdown 10987";
        int alphaCount=0;
        for (int i = 0; i < myString.length(); i++) {
            if (Character.isLetter(myString.charAt(i))){
            alphaCount++;

        }
    }
        System.out.println(" In this string number of alphabetic characters: " +alphaCount);


}
}