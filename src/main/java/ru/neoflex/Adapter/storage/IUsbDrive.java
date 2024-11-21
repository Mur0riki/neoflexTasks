package ru.neoflex.Adapter.storage;

public interface IUsbDrive {
    String readFromUsb();
    void writeToUsb(String information);
}
