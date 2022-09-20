package decorator;

public abstract class Napoj {
    String opis = "Napój nieznany";

    public String getOpis() {
        return opis;
    }

    public abstract double koszt();
}
