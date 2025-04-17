package interfaces;

public class CDPlayer implements Media{

    @Override
    public void Start() {
        System.out.println("CD Player Started");
    }

    @Override
    public void Stop() {
        System.out.println("CD Player Stopped");
    }
}
