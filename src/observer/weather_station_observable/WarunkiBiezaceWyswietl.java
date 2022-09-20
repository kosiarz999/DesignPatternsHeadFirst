package observer.weather_station_observable;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezaceWyswietl implements Observer, WyswietlElement {
    Observable observable;
    private float temperatura;
    private float wilgotnosc;

    public WarunkiBiezaceWyswietl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            var danePogodowe = (DanePogodowe) o;
            this.temperatura = danePogodowe.getTemperatura();
            this.wilgotnosc = danePogodowe.getWilgotnosc();
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println();
        System.out.println("Warunki bieżące " + temperatura + " stopni C oraz " + wilgotnosc + "% wilgotności.");
    }
}
