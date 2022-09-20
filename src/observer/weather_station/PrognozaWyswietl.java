package observer.weather_station;

public class PrognozaWyswietl implements Obserwator, WyswietlElement {
    private float obecneCisnienie = 29.92f;
    private float ostatnieCisnienie;
    private DanePogodowe danePogodowe;

    public PrognozaWyswietl(DanePogodowe danePogodowe) {
        this.danePogodowe = danePogodowe;
        danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        ostatnieCisnienie = obecneCisnienie;
        obecneCisnienie = cisnienie;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Prognoza: ");
        if (obecneCisnienie > ostatnieCisnienie) {
            System.out.println("Nadchodzi poprawa pogody");
        } else if (obecneCisnienie == ostatnieCisnienie) {
            System.out.println("Bez zmian");
        } else if (obecneCisnienie < ostatnieCisnienie) {
            System.out.println("Pogoda ulegnie pogorszeniu.");
        }
    }
}
