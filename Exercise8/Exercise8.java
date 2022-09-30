package Exercise8;

public class Exercise8 {

    public static void main(String[] args) {

        Car c1 = new Car("Golf");
        Car c2 = new Car("BMW");
        WarCar c3 = new WarCar("Leopard", 100);
        WarCar c4 = new WarCar("Panter", 50);

        c1.setOn(true);
        c1.info();
        c2.info();
        c3.info();
        c4.info();

    }
}
