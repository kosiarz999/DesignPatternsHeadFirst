package factory.method;

// konkretna fabryka
public class AmerykanskaPizzeria extends Pizzeria {
    @Override
    protected Pizza utworzPizza(String item) {
        if (item.equals("serowa")) {
            return new AmerykanskaSerowaPizza();
        } else if (item.equals("wegetariańska")) {
            return new AmerykanskaWegetarianskaPizza();
        } else if (item.equals("owoce morza")) {
            return new AmerykanskaOwoceMorzaPizza();
        } else if (item.equals("pepperoni")) {
            return new AmerykanskaPepperoniPizza();
        } else return null;
    }
}
