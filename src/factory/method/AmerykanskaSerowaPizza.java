package factory.method;

// konkretny produkt
public class AmerykanskaSerowaPizza extends Pizza{
    public AmerykanskaSerowaPizza() {
        nazwa = "Amerykańska Pizza Serowa";
        ciasto = "Extra grube, chrupkie ciasto";
        sos = "Sos z pomidorów śliwkowych";

        dodatki.add("Grubo tarty ser Mozzarella");
    }

    void krojenie() {
        System.out.println("Krojenie pizzy na kwadratowe kawałki");
    }
}
