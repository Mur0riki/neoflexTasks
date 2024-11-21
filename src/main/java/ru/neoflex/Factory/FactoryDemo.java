package ru.neoflex.Factory;

import ru.neoflex.Demo;
import ru.neoflex.Factory.coffee.ACoffee;
import ru.neoflex.Factory.coffee.CoffeeType;
import ru.neoflex.Factory.machine.CoffeeFactory;
import ru.neoflex.Factory.machine.CoffeeMachine;

public class FactoryDemo implements Demo {

    @Override
    public void startDemo() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);
        ACoffee coffeeAmericano = coffeeMachine.brewCoffee(CoffeeType.AMERICANO);
        ACoffee coffeeEspresso = coffeeMachine.brewCoffee(CoffeeType.ESPRESSO);
    }
}
