package strategy.duck;

import strategy.duck.fly.NieLatam;
import strategy.duck.quack.Kwacz;

public class ModelKaczki extends Kaczka {
    public ModelKaczki() {
        kwakanieInterface = new Kwacz();
        latanieInterface = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("To tylko model kaczki.");
    }
}
