package interfaces;

public class Nicecar {
    private Engine engine;
    private Media player = new CDplayer();

    public Nicecar() {
        this.engine = new PoweEngine();
    }

    // public Nicecar(Engine engine) {
    //     this.engine = engine;
    // }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        if(engine instanceof PoweEngine){

            this.engine = new ElecticEngine();
        }else{
            this.engine = new PoweEngine();

        }
    }
}