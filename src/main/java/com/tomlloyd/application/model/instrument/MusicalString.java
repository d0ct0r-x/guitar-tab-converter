package com.tomlloyd.application.model.instrument;

public class MusicalString {

    private int fret = -1;
    private final int numberOfFrets;

    public MusicalString(int numberOfFrets) {
        this.numberOfFrets = numberOfFrets;
    }

    public int getNumberOfFrets() {
        return numberOfFrets;
    }

    public int getFret() {
        return this.fret;
    }

    public void setFret(int fret) {
        this.fret = fret;
    }

    @Override
    public String toString() {
        return getFret() == -1 ? " " : String.valueOf(getFret());
    }
}
