package ru.neoflex.Adapter;

import ru.neoflex.Adapter.storage.IUsbDrive;

public class Computer {
    public void readUSB(IUsbDrive usbDrive) {
        System.out.println("Computer reads: " + usbDrive.readFromUsb());
    }
}
