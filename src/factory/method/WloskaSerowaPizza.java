package factory.method;

// konkretny produkt
public class WloskaSerowaPizza extends Pizza {
    public WloskaSerowaPizza() {
        nazwa = "Włoska pizza serowa z sosem Marinara";
        ciasto = "Cienkie kruche ciasto";
        sos = "Sos Marinara";

        dodatki.add("Tarty ser Reggiano");
    }
}
