package strategy.duck.types;

import strategy.duck.fly.NieLatam;
import strategy.duck.quack.Piszcz;

public class GumowaKaczka extends Kaczka {
    public GumowaKaczka() {
        kwakanieInterface = new Piszcz();
        latanieInterface = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Oto gumowa kaczka.");
    }
}
