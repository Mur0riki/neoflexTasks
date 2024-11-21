package ru.neoflex.Proxy;

public class DatabaseProxy implements IConnection {

    @Override
    public void connect(String destination) {
        String url = "localhost:8080/";

        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }

        databaseConnection.connect(url + destination);
    }

    private IConnection databaseConnection;
}