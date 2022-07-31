import strategy.duck.*;
import strategy.duck.fly.LotZNapedemRakietowym;

public class Main {

    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wyswietl();
        dzika.wykonajKwacz();
        dzika.wykonajLec();

        Kaczka gumowa = new GumowaKaczka();
        gumowa.wyswietl();
        gumowa.wykonajKwacz();
        gumowa.wykonajLec();

        Kaczka model = new ModelKaczki();
        model.wyswietl();
        model.wykonajKwacz();
        model.wykonajLec();
        model.setLatanieInterface(new LotZNapedemRakietowym());
        model.wykonajLec();

        Kaczka wabik = new WabikKaczka();
        wabik.wyswietl();
        wabik.wykonajKwacz();
        wabik.wykonajLec();

        Kaczka plaskonos = new PlaskonosKaczka();
        plaskonos.wyswietl();
        plaskonos.wykonajKwacz();
        plaskonos.wykonajLec();
    }


}
