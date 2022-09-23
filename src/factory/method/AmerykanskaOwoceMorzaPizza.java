package factory.method;

// konkretny produkt
public class AmerykanskaOwoceMorzaPizza extends Pizza {
    public AmerykanskaOwoceMorzaPizza() {
        nazwa = "Amerykańska Pizza z Owocami Morza";
        ciasto = "Extra grube, chrupkie ciasto";
        sos = "Sos z pomidorów śliwkowych";

        dodatki.add("Grubo tarty ser Mozzarella");
        dodatki.add("Mrożone krewetki");
    }

    void krojenie() {
        System.out.println("Krojenie pizzy na kwadratowe kawałki");
    }
}
