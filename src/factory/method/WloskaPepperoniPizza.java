package factory.method;

// konkretny produkt
public class WloskaPepperoniPizza extends Pizza {
    public WloskaPepperoniPizza() {
        nazwa = "Włoska pizza pepperoni";
        ciasto = "Cienkie kruche ciasto";
        sos = "Sos Marinara";

        dodatki.add("Tarty ser Reggiano");
        dodatki.add("Pepperoni");
        dodatki.add("Czosnek");
        dodatki.add("Cebula");
        dodatki.add("Grzyby");
        dodatki.add("Czerwona papryka");
    }
}
