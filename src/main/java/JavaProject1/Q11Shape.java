package JavaProject1;

import java.awt.*;

public interface Q11Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Q11Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Square implements Q11Shape {
    private double side;
    public Square(double side) {
    this.side = side;
    }
    public double calculateArea() {
        return side * side;
    }
    public double calculatePerimeter() {
        return 4 * side;
    }
}
