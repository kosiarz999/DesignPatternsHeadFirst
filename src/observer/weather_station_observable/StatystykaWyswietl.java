package observer.weather_station_observable;

import java.util.Observable;
import java.util.Observer;

public class StatystykaWyswietl implements Observer, WyswietlElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    Observable observable;

    public StatystykaWyswietl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe) o;
            float temp = danePogodowe.getTemperatura();
            tempSum += temp;
            numReadings++;
            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println("Średnia/Max/Min temperatura = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
