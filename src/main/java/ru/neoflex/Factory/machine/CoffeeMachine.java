package ru.neoflex.Factory.machine;

import ru.neoflex.Factory.coffee.ACoffee;
import ru.neoflex.Factory.coffee.CoffeeType;

public class CoffeeMachine {

    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        if (coffeeFactory == null) {
            throw new NullPointerException("coffeeFactory is null");
        }

        this.coffeeFactory = coffeeFactory;
    }

    public ACoffee brewCoffee(CoffeeType coffeeType) {
        ACoffee coffee = coffeeFactory.createCoffee(coffeeType);

        System.out.println("Brewing your coffee: " + coffee.getCoffeeType().toString().toLowerCase());


        System.out.println("Pouring your coffee into a cup.");

        return coffee;
    }

    private final CoffeeFactory coffeeFactory;
}
