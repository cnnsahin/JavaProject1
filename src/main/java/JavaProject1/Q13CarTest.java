package JavaProject1;

public class Q13CarTest {
    public static void main(String[] args) {
        Truck truck = new Truck(30000, "White", 2500);
        Sedan sedan = new Sedan(25000, "Green", 18);
        System.out.println("Truck Sale Price: " + truck.calculateSalePrice());
        System.out.println("Sedan Sale Price: " + sedan.calculateSalePrice());
    }
}
