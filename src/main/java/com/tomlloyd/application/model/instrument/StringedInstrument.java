package com.tomlloyd.application.model.instrument;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class StringedInstrument extends Instrument {

    private final List<MusicalString> strings;

    public StringedInstrument(final int numberOfStrings, final int numberOfFrets) {
        this.strings = Stream.generate(() -> new MusicalString(numberOfFrets))
                .limit(numberOfStrings)
                .collect(Collectors.toList());
    }

    public MusicalString getString(int index) {
        return this.strings.get(index);
    }

    @Override
    public String toString() {
        return String.valueOf(this.strings);
    }
}
