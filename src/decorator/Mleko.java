package decorator;

public class Mleko extends SkladnikDekorator {
    Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.10;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + ", mleko";
    }
}
