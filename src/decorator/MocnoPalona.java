package decorator;

public class MocnoPalona extends Napoj {
    public MocnoPalona() {
        opis = "Kawa Mocno Palona";
    }

    @Override
    public double koszt() {
        return 0.99;
    }
}
