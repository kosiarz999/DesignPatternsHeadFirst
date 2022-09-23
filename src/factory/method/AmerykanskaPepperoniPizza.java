package factory.method;

// konkretny produkt
public class AmerykanskaPepperoniPizza extends Pizza {
    public AmerykanskaPepperoniPizza() {
        nazwa = "Amerykańska Pizza Pepperoni";
        ciasto = "Extra grube, chrupkie ciasto";
        sos = "Sos z pomidorów śliwkowych";

        dodatki.add("Grubo tarty ser Mozzarella");
        dodatki.add("Czarne oliwki");
        dodatki.add("Szpinak");
        dodatki.add("Bakłażan");
        dodatki.add("Pepperoni");
    }

    void krojenie() {
        System.out.println("Krojenie pizzy na kwadratowe kawałki");
    }
}
