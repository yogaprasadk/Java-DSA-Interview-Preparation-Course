package interfaces.extendsdemo2;

public class Main implements A, B {
    // interface can able to implement multiple interfaces.
    @Override
    public void greek() {

    }

    public static void main(String[] args) {
        // you can call it through interface.
        A.funp();
    }
}
