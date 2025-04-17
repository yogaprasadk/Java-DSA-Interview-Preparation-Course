package interfaces;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake() {
        System.out.println("I brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like normal car");
    }

    @Override
    public void acce() {
        System.out.println("I accelerate like normal car");
    }


    @Override
    public void Start() {
        System.out.println("Media Player is started");
    }

    @Override
    public void Stop() {
        System.out.println("Media Player is stopped");
    }
}
