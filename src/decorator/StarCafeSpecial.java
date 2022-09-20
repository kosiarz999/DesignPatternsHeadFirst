package decorator;

public class StarCafeSpecial extends Napoj {
    public StarCafeSpecial() {
        opis = "Kawa Star Cafe Special";
    }

    @Override
    public double koszt() {
        return 0.89;
    }
}
