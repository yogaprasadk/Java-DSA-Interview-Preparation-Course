package interfaces;

public class Nicecar{
    private Engine engine;
    private Media player = new CDPlayer();

    public Nicecar() {
        engine = new Powerengine();
    }

    public Nicecar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startmusic(){
        player.Start();
    }

    public void stopmusic(){
        player.Stop();
    }

    public void upgradeEngine(){
        this.engine =new Electricengine();
    }

}
