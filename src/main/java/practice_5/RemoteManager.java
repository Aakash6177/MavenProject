package practice_5;

public class RemoteManager {

    public static void main(String[] args) {
        Remote r1 = new Remote();

        r1.showDetails();
        r1.increaseVolume();
        r1.showDetails();
        r1.mute();
        r1.showDetails();
        r1.increaseVolume();
        r1.showDetails();
    }

}
