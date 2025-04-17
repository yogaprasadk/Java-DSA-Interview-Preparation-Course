package interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        // on left what we declared that class method only access
        Engine car1 = new Car();
        car1.acce();

        Media n = new Car();
        n.Start();

        Nicecar nc = new Nicecar();
        nc.start();
        nc.startmusic();
        nc.upgradeEngine();
        nc.start();
    }
}
