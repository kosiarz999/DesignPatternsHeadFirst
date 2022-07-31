package strategy.duck.types;

import strategy.duck.fly.LatanieInterface;
import strategy.duck.quack.KwakanieInterface;

public abstract class Kaczka {
    LatanieInterface latanieInterface;
    KwakanieInterface kwakanieInterface;

    public Kaczka() {
    }

    public abstract void wyswietl();

    public void plywaj() {
        System.out.println("Pływam.");
    }

    public void wykonajKwacz() {
        kwakanieInterface.kwacz();
    }

    public void wykonajLec() {
        latanieInterface.lec();
    }

    public void setLatanieInterface(LatanieInterface latanieInterface) {
        this.latanieInterface = latanieInterface;
    }

    public void setKwakanieInterface(KwakanieInterface kwakanieInterface) {
        this.kwakanieInterface = kwakanieInterface;
    }

}
