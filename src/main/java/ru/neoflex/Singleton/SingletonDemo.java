package ru.neoflex.Singleton;

import ru.neoflex.Demo;

public class SingletonDemo implements Demo {
    @Override
    public void startDemo() {
        Thread thread = new Thread(new LoggerThread());
        thread.start();

        Logger logger = Logger.getInstance();

        /*
        В обоих потоках будет вызван метод getInstance и double-checked locking
        обеспечит нам то, что не будет создано два объекта класса Logger
         */
        System.out.println("getInstance() was called from the first thread: " + logger);

        Integer integerInstance = 42;
        Boolean booleanInstance = false;

        logger.classLog(integerInstance, "This is an instance of an Integer class with a value of " + integerInstance);
        logger.classLog(booleanInstance, "This is an instance of a Double class with a value of " + booleanInstance);
        logger.classLog(logger, "This is an instance of a Logger class");
    }
}
