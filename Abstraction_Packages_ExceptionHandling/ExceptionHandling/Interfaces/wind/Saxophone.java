package Abstraction_Packages_ExceptionHandling.ExceptionHandling.Interfaces.wind;



mport Q1.music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Saxophone is playing");
    }
}