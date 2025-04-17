package Abstraction;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a Pilot");
    }

    @Override
    void partner() {
        System.out.println("I Love DOra");
    }
}
    