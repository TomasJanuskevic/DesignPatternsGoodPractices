package deignPatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new SimplyNonVegPizza();

        pizza = new Cheese(pizza);
        pizza = new Chicken(pizza);
        pizza = new Meat(pizza);
        pizza = new FetaCheese(pizza);

        System.out.println(pizza.getDesc());
        System.out.println(pizza.getPrice());
    }
}
