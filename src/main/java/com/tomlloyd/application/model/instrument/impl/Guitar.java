package com.tomlloyd.application.model.instrument.impl;

import com.tomlloyd.application.model.instrument.StringedInstrument;

public class Guitar extends StringedInstrument {

    private static final int NUMBER_OF_STRINGS = 6;
    private static final int NUMBER_OF_FRETS = 24;

    public Guitar() {
        this(NUMBER_OF_STRINGS, NUMBER_OF_FRETS);
    }

    private Guitar(int numberOfStrings, int numberOfFrets) {
        super(numberOfStrings, numberOfFrets);
    }

    @Override
    public String toString() {
        return "Guitar" + super.toString();
    }
}
