package ru.neoflex.Adapter;

import ru.neoflex.Adapter.storage.IUsbDrive;
import ru.neoflex.Adapter.storage.SDCard;

public class CardReader implements IUsbDrive {

    public CardReader(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SDCard is null");
        }

        this.sdCard = sdCard;
    }

    public void insertSDCard(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("SDCard is null");
        }

        this.sdCard = sdCard;
    }

    @Override
    public String readFromUsb() {
        if (sdCard == null) {
            throw new NullPointerException("SDCard is null");
        }

        return sdCard.getInformation();
    }

    @Override
    public void writeToUsb(String information) {
        this.sdCard.writeInformation(information);
    }

    private SDCard sdCard = null;
}
