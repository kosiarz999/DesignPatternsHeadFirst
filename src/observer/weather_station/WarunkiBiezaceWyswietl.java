package observer.weather_station;

public class WarunkiBiezaceWyswietl implements Obserwator, WyswietlElement {
    private float temperatura;
    private float wilgotnosc;
    private Podmiot danePogodowe;

    public WarunkiBiezaceWyswietl(Podmiot danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temperatura = temp;
        this.wilgotnosc = wilgotnosc;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println();
        System.out.println("Warunki bieżące " + temperatura
            + " stopni C oraz " + wilgotnosc + "% wilgotności.");
    }
}
