package practice_5;

public class Remote {

    private int volume;
    private boolean mute;

    public Remote(){
        this.volume = 10;
        this.mute = false;
    }

    public void increaseVolume(){
        if(this.volume >= 0){
            this.mute = false;
            this.volume++;
        }
    }

    public void decreaseVolume(){
        if(this.volume >=0){
            if(this.volume != 0){
                this.volume--;
            }
            this.mute = true;
        }
    }

    public void mute(){
        this.volume = 0;
        this.mute = true;
    }
    public void showDetails(){
        System.out.println("Volume: "+this.volume);
        System.out.println("Is Mute: "+this.mute);
    }
}
