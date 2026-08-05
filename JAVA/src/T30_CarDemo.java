class Car {
    String brand, color;
    int price;

    void drive() {
        System.out.println(brand + " car driving");
    }
}

public class T30_CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand="Audi";
        System.out.println(car1.brand);
        car1.drive();
    }
}

