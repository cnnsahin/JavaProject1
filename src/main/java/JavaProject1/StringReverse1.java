package JavaProject1;

public class StringReverse1 {
    public static void main(String[] args) {

        String str= "Canan", nstr ="";
        char ch;
        System.out.println("Original word is :" + str);

        for (int i = 0; i <str.length() ; i++) {
            ch=str.charAt(i);
            nstr=ch+nstr;

        }
        System.out.println("Reversed word is:" + nstr);
    }
}
