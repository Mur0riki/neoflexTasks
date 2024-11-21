package ru.neoflex.Factory.coffee;

public abstract class ACoffee {

    public CoffeeType getCoffeeType() {
        return this.coffeeType;
    }

    protected CoffeeType coffeeType;
}
