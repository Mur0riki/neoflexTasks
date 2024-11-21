package ru.neoflex.Factory.machine;

import ru.neoflex.Factory.coffee.ACoffee;
import ru.neoflex.Factory.coffee.AmericanoCoffee;
import ru.neoflex.Factory.coffee.CoffeeType;
import ru.neoflex.Factory.coffee.EspressoCoffee;

public class CoffeeFactory {
    public ACoffee createCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case CoffeeType.AMERICANO -> new AmericanoCoffee();
            case CoffeeType.ESPRESSO -> new EspressoCoffee();
        };
    }
}
