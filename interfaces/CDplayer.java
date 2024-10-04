package interfaces;

public class CDplayer  implements Media {

    @Override
    public void start() {
        
        System.out.println("player stared");
    }

    @Override
    public void stop() {
        System.out.println("player stoped");
        
    }
    
}
