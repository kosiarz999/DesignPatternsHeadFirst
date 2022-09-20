package observer.weather_station_observable;

import java.util.Observable;
import java.util.Observer;

public class PrognozaWyswietl implements Observer, WyswietlElement {
    private float biezaceCisnienie = 1010.1f;
    private float ostatnieCisnienie;
    Observable observable;

    public PrognozaWyswietl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            var danePogodowe = (DanePogodowe) o;
            ostatnieCisnienie = biezaceCisnienie;
            biezaceCisnienie = danePogodowe.getCisnienie();
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println("Prognoza: ");
        if (biezaceCisnienie > ostatnieCisnienie) {
            System.out.println("Nadchodzi poprawa pogody");
        } else if (biezaceCisnienie == ostatnieCisnienie) {
            System.out.println("Bez zmian");
        } else if (biezaceCisnienie < ostatnieCisnienie) {
            System.out.println("Pogoda ulegnie pogorszeniu.");
        }
    }
}
