package strategy.duck;

import strategy.duck.fly.LotZNapedemRakietowym;
import strategy.duck.types.*;

public class Main {

    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wyswietl();
        dzika.wykonajKwacz();
        dzika.wykonajLec();
        System.out.println();

        Kaczka gumowa = new GumowaKaczka();
        gumowa.wyswietl();
        gumowa.wykonajKwacz();
        gumowa.wykonajLec();
        System.out.println();

        Kaczka model = new ModelKaczki();
        model.wyswietl();
        model.wykonajKwacz();
        model.wykonajLec();
        model.setLatanieInterface(new LotZNapedemRakietowym());
        model.wykonajLec();
        System.out.println();

        Kaczka wabik = new WabikKaczka();
        wabik.wyswietl();
        wabik.wykonajKwacz();
        wabik.wykonajLec();
        System.out.println();

        Kaczka plaskonos = new PlaskonosKaczka();
        plaskonos.wyswietl();
        plaskonos.wykonajKwacz();
        plaskonos.wykonajLec();
    }


}
