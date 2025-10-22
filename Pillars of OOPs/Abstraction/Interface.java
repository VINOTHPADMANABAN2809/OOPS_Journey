package Abstraction;

interface mediaplayer{
    void play();
    void stop();
}

class spotify implements mediaplayer{
    public void play(){
        System.out.println("Spotify is playing");
    }

    public void stop(){
        System.out.println("Stopping spotify");
    }
}

class vlc implements mediaplayer{
    public void play(){
        System.out.println("vlc playing");
    }

    public void stop(){
        System.out.println("Stopping vlc");
    }
}

public class Interface {
    public static void main(String[] vk){
        mediaplayer m;

        m = new spotify();
        m.play();
        m.stop();

        m = new vlc();
        m.play();
        m.stop();
    }
}
