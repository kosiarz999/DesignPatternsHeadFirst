package decorator;

public class MleczkoSojowe extends SkladnikDekorator {
    Napoj napoj;

    public MleczkoSojowe(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.15;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + ", mleczko sojowe";
    }
}
