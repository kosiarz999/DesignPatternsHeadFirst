package strategy.duck;

import strategy.duck.fly.NieLatam;
import strategy.duck.quack.Kwacz;

public class WabikKaczka extends Kaczka {
    public WabikKaczka() {
        kwakanieInterface = new Kwacz();
        latanieInterface = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Oto wabik.");
    }
}
