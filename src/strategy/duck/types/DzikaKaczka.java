package strategy.duck.types;

import strategy.duck.fly.LatamBoMamSkrzydla;
import strategy.duck.quack.Kwacz;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterface = new Kwacz();
        latanieInterface = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Oto dzika kaczka.");
    }
}
