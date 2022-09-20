package observer.weather_station;

public class StatystykaWyswietl implements Obserwator, WyswietlElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private DanePogodowe danePogodowe;

    public StatystykaWyswietl(DanePogodowe danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }


    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
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

    @Override
    public void wyswietl() {
        System.out.println("Średnia/Max/Min temperatura = " + (tempSum / numReadings)
            + "/" + maxTemp + "/" + minTemp);
    }
}
