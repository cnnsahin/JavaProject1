package JavaProject1;

public class Q12MarksTest {
    public static void main(String[] args) {
        A studentA = new A(80, 75, 90);
        B studentB = new B(85, 88, 75, 90);
        System.out.println("Percentage for Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage for Student B: " + studentB.getPercentage() + "%");
    }
}
