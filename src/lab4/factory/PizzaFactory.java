package lab4.factory;

public abstract class PizzaFactory {

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
