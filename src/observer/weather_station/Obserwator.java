package observer.weather_station;

public interface Obserwator {
    void aktualizacja(float temp, float wilgotnosc, float cisnienie);
}
