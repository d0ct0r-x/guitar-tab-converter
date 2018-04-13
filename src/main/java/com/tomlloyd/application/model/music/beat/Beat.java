package com.tomlloyd.application.model.music.beat;

import com.tomlloyd.application.model.instrument.Instrument;

public class Beat<T extends Instrument> {

    private final T instrument;
    private Class<T> token;

    public Beat() throws IllegalAccessException, InstantiationException {
        this.instrument = token.newInstance();
    }

    public T getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "BEAT";
    }
}
