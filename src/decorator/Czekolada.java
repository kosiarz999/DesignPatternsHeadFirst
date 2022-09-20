package decorator;

public class Czekolada extends SkladnikDekorator {
    Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.20;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + ", czekolada";
    }
}
