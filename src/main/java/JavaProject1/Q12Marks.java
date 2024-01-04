package JavaProject1;
/*
We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getPercentage' that will return the average percentage of marks.
 Provide implementation of abstract methods in classes 'A' and 'B'.
 The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code

 */
abstract class Q12Marks {
    abstract double getPercentage();
}
class A extends Q12Marks {
    private int subject1, subject2, subject3;
    public A(int subject1, int subject2, int subject3) {
    this.subject1 = subject1;
    this.subject2 = subject2;
    this.subject3 = subject3;
    }
    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}
class B extends Q12Marks {
    private int subject1, subject2, subject3, subject4;
    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }
    @Override    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}
