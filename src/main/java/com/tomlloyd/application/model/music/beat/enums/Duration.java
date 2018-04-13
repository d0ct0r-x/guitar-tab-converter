package com.tomlloyd.application.model.music.beat.enums;

public enum Duration {

    WHOLE(1, 'W'),
    HALF(2, 'H'),
    QUARTER(4, 'Q'),
    EIGHTH(8, 'E'),
    SIXTEENTH(16, 'S'),
    THIRTYSECOND(32, 'T'),
    SIXTYFOURTH(64, 'X');

    private final int number;
    private final char symbol;

    Duration(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public char getSymbol() {
        return symbol;
    }
}
