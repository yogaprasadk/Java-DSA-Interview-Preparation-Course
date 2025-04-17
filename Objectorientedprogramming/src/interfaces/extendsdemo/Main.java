package interfaces.extendsdemo;

public class Main implements B{
    // interface can able to implement multiple interfaces.
    @Override
    public void greek() {
        System.out.println("GReek");
    }

    @Override
    public void fun() {
        System.out.println("Fun");
    }

}
