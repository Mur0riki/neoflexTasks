package ru.neoflex.Adapter;

import ru.neoflex.Adapter.storage.IUsbDrive;
import ru.neoflex.Adapter.storage.SDCard;
import ru.neoflex.Adapter.storage.UsbDrive;
import ru.neoflex.Demo;

public class AdapterDemo implements Demo {

    @Override
    public void startDemo() {
        Computer computer = new Computer();

        IUsbDrive usbDrive = new UsbDrive();
        usbDrive.writeToUsb("Information on USB Drive.");
        computer.readUSB(usbDrive);

        SDCard sdCard = new SDCard();
        sdCard.writeInformation("Information on SD Card.");

        IUsbDrive cardReader = new CardReader(sdCard);
        computer.readUSB(cardReader);
    }
}
