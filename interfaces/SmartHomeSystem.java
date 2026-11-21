package interfaces;

public class SmartHomeSystem {
    public static void main(String[] args) {
        Camera c = new Smartphone();
        c.takePhoto();

        MusicPlayer m = new Smartphone(); 
        m.playMusic();
    }

}

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Camera is taking a photo ");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is playing");
    }
}
