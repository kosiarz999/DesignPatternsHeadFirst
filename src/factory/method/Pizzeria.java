package factory.method;

// Fabryka
public abstract class Pizzeria {
    protected abstract Pizza utworzPizza(String type);

    public Pizza zamowPizza(String type) {
        Pizza pizza = utworzPizza(type);
        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();
        return pizza;
    }
}
