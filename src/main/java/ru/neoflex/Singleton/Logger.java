package ru.neoflex.Singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static volatile Logger instanse = null;

    //Приватный конструктор класса для обеспечения создания инстанса Logger единождны при вызове метода getIntstance
    private Logger() {
    }

    /*
    Использую Double-Checked logging
    */
    public static Logger getInstance() {
        if (instanse == null) {
            synchronized (Logger.class) {
                if (instanse == null) {
                    instanse = new Logger();
                }
            }
        }
        return instanse;
    }

    public void classLog(Object object, String info) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy HH:mm:ss");
        System.out.println("Log info: " + date.format(formatter) + " - "
                + object.getClass().getCanonicalName() + " - "
                + info);
    }
}
