package ru.neoflex.Proxy;

import ru.neoflex.Demo;

public class ProxyDemo implements Demo {

    @Override
    public void startDemo() {
        IConnection databaseConnection = new DatabaseConnection();
        IConnection databaseProxy = new DatabaseProxy();

        databaseConnection.connect("testDB");
        databaseProxy.connect("testDB");
    }
}