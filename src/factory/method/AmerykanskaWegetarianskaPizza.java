package factory.method;

// konkretny produkt
public class AmerykanskaWegetarianskaPizza extends Pizza {
    public AmerykanskaWegetarianskaPizza() {
        nazwa = "Amerykańska Pizza Wegetariańska";
        ciasto = "Extra grube, chrupkie ciasto";
        sos = "Sos z pomidorów śliwkowych";

        dodatki.add("Grubo tarty ser Mozzarella");
        dodatki.add("Czarne oliwki");
        dodatki.add("Szpinak");
        dodatki.add("Bakłażan");
    }

    void krojenie() {
        System.out.println("Krojenie pizzy na kwadratowe kawałki");
    }
}
