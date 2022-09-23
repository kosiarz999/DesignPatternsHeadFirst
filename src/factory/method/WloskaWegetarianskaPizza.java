package factory.method;

// konkretny produkt
public class WloskaWegetarianskaPizza extends Pizza {
    public WloskaWegetarianskaPizza() {
        nazwa = "Włoska pizza wegetariańska";
        ciasto = "Cienkie kruche ciasto";
        sos = "Sos Marinara";

        dodatki.add("Tarty ser Reggiano");
        dodatki.add("Czosnek");
        dodatki.add("Cebula");
        dodatki.add("Grzyby");
        dodatki.add("Czerwona papryka");
    }
}
