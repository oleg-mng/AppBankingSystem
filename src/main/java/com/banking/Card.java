package com.banking;

public class Card {
    private long numberCard;
    private long pin;

    public Card(long numberCard, long pin) {
        this.numberCard = numberCard;
        this.pin = pin;
    }

    public long getNumberCard() {
        return numberCard;
    }

    public long getPin() {
        return pin;
    }

    public void setNumberCard(long numberCard) {
        this.numberCard = numberCard;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
