public class Main {

    public static void main(String[] args) {


        Car car = new Car();
        car.setMake("Toyota");
        car.setModel("Supra");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("Red");

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();


        Car coupe = new Car();
        car.setMake("Honda");
        car.setModel("NSX");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("Black");

        coupe.describeCar();

    }

}