package Abstraction;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Engineer");
    }

    @Override
    void partner() {
        System.out.println("I Love Ben 10");
    }
}
