package com.tomlloyd.application.model.music.beat.enums;

public enum Dotting {

    NONE(0, ""),
    SINGLE(1, "."),
    DOUBLE(2, "..");

    private final int number;
    private final String symbol;

    Dotting(int number, String symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }
}
