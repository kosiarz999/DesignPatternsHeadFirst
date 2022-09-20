package observer.weather_station;

public class IndeksCieplaWyswietl implements Obserwator, WyswietlElement {
    private float indeksCiepla = 0.0f;
    private Podmiot danePogodowe;

    public IndeksCieplaWyswietl(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    private float obliczIndeksCiepla(float temp, float wilgotnosc) {
        float tempFahrenheit = 1.8f * temp + 32;
        float index = (float)((16.923 + (0.185212 * tempFahrenheit) + (5.37941 * wilgotnosc) - (0.100254 * tempFahrenheit * wilgotnosc)
                + (0.00941695 * (tempFahrenheit * tempFahrenheit)) + (0.00728898 * (wilgotnosc * wilgotnosc))
                + (0.000345372 * (tempFahrenheit * tempFahrenheit * wilgotnosc)) - (0.000814971 * (tempFahrenheit * wilgotnosc * wilgotnosc)) +
                (0.0000102102 * (tempFahrenheit * tempFahrenheit * wilgotnosc * wilgotnosc)) - (0.000038646 * (tempFahrenheit * tempFahrenheit * tempFahrenheit)) + (0.0000291583 *
                (wilgotnosc * wilgotnosc * wilgotnosc)) + (0.00000142721 * (tempFahrenheit * tempFahrenheit * tempFahrenheit * wilgotnosc)) +
                (0.000000197483 * (tempFahrenheit * wilgotnosc * wilgotnosc * wilgotnosc)) - (0.0000000218429 * (tempFahrenheit * tempFahrenheit * tempFahrenheit * wilgotnosc * wilgotnosc)) +
                0.000000000843296 * (tempFahrenheit * tempFahrenheit * wilgotnosc * wilgotnosc * wilgotnosc)) -
                (0.0000000000481975 * (tempFahrenheit * tempFahrenheit * tempFahrenheit * wilgotnosc * wilgotnosc * wilgotnosc)));

        float indexCelsius = (index - 32) * (5.0f / 9.0f);
        return indexCelsius;
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        indeksCiepla = obliczIndeksCiepla(temp, wilgotnosc);
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Obliczony indeks ciepła ma wartość " + indeksCiepla);
    }
}
