package by.bntu.fitr.povt.patterns.facade;

public class Amplifier {

    DvdPlayer dvdPlayer;
    int sound;

    public void on(){
        System.out.println("Dvd Player is ON!");
    }

    public void setDvd(DvdPlayer dvd){
        this.dvdPlayer = dvd;
    }

    public void setSurroundSound(){}

    public void setVolume(int n){ System.out.println("Volume " + n);}

}