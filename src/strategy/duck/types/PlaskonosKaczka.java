package strategy.duck.types;

import strategy.duck.fly.LatamBoMamSkrzydla;
import strategy.duck.quack.Kwacz;

public class PlaskonosKaczka extends Kaczka{

    public PlaskonosKaczka() {
        kwakanieInterface = new Kwacz();
        latanieInterface = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Oto kaczka płaskonosa.");
    }
}
