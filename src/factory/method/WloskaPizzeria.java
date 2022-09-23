package factory.method;

// konkretna fabryka
public class WloskaPizzeria extends Pizzeria {
    @Override
    protected Pizza utworzPizza(String item) {
        if (item.equals("serowa")) {
            return new WloskaSerowaPizza();
        } else if (item.equals("wegetariańska")) {
            return new WloskaWegetarianskaPizza();
        } else if (item.equals("owoce morza")) {
            return new WloskaOwoceMorzaPizza();
        } else if (item.equals("pepperoni")) {
            return new WloskaPepperoniPizza();
        } else return null;
    }
}
