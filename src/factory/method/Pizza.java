package factory.method;

import java.util.ArrayList;

// Produkt
public abstract class Pizza {
    String nazwa;
    String ciasto;
    String sos;
    ArrayList<String> dodatki = new ArrayList<>();

    void przygotowanie() {
        System.out.println("Przygotowanie: " + nazwa);
        System.out.println("Wyrabianie ciasta...");
        System.out.println("Dodawanie sosu...");
        System.out.println("Dodatki: ");
        for (int i = 0; i < dodatki.size(); i++) {
            System.out.println(" " + dodatki.get(i));
        }
    }

    void pieczenie() {
        System.out.println("Pieczenie: 25 minnut w temperaturze 350 stopni Celsjusza");
    }

    void krojenie() {
        System.out.println("Krojenie pizzy na 8 kawałków");
    }

    void pakowanie() {
        System.out.println("Pakowanie pizzy");
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + nazwa + " ----\n");
        display.append(ciasto + "\n");
        display.append(sos + "\n");
        for (String s: dodatki) {
            display.append(s + "\n");
        }

        return display.toString();
    }
}
