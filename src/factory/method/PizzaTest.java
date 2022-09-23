package factory.method;

// Konkretny produkt jest tworzony przez konkretną fabrykę.
public class PizzaTest {
    public static void main(String[] args) {
        Pizzeria wloska = new WloskaPizzeria();
        Pizzeria amerykanska = new AmerykanskaPizzeria();

        Pizza pizza = wloska.zamowPizza("serowa");
        System.out.println("Eryk zamówił: " + pizza.getNazwa() + " \n");

        pizza = amerykanska.zamowPizza("serowa");
        System.out.println("Jacek zamówił: " + pizza.getNazwa() + "\n");

        pizza = wloska.zamowPizza("owoce morza");
        System.out.println("Eryk zamówił: " + pizza.getNazwa() + " \n");

        pizza = amerykanska.zamowPizza("owoce morza");
        System.out.println("Jacek zamówił: " + pizza.getNazwa() + "\n");

        pizza = wloska.zamowPizza("pepperoni");
        System.out.println("Eryk zamówił: " + pizza.getNazwa() + " \n");

        pizza = amerykanska.zamowPizza("pepperoni");
        System.out.println("Jacek zamówił: " + pizza.getNazwa() + "\n");

        pizza = wloska.zamowPizza("wegetariańska");
        System.out.println("Eryk zamówił: " + pizza.getNazwa() + " \n");

        pizza = amerykanska.zamowPizza("wegetariańska");
        System.out.println("Jacek zamówił: " + pizza.getNazwa() + "\n");


    }
}
