package decorator;

public class BitaSmietana extends SkladnikDekorator {
    Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.10;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + ", bita śmietana";
    }
}
