package factory.method;

// konkretny produkt
public class WloskaOwoceMorzaPizza extends Pizza{
    public WloskaOwoceMorzaPizza() {
        nazwa = "Włoska pizza z owocami morza";
        ciasto = "Cienkie kruche ciasto";
        sos = "Sos Marinara";

        dodatki.add("Tarty ser Reggiano");
        dodatki.add("Świeże krewetki z Bałtyku");
    }
}
