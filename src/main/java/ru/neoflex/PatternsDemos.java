package ru.neoflex;

import ru.neoflex.Adapter.AdapterDemo;
import ru.neoflex.Factory.FactoryDemo;
import ru.neoflex.Singleton.SingletonDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PatternsDemos {
    public static void main(String[] args) {
        System.out.println("Print 0 to exit.");
        System.out.println("Print 1 to see Singleton demonstration.");
        System.out.println("Print 2 to see Factory demonstration.");
        System.out.println("Print 3 to see Adapter demonstration");
        System.out.print("Enter your choice: ");

        try (Scanner scanner = new Scanner(System.in)) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                return;
            }

            Demo demo = chooseDemo(choice);
            demo.startDemo();
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("You have to input a number between 0 and 3.");
        }


    }

    private static Demo chooseDemo(int number) {

        return switch (number) {
            case 1 -> new SingletonDemo();
            case 2 -> new FactoryDemo();
            case 3 -> new AdapterDemo();
            default -> throw new IllegalArgumentException("Number must be from 1 to 3.");
        };
    }
}
