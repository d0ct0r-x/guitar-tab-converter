package com.tomlloyd.application.model.music;

import com.tomlloyd.application.model.instrument.Instrument;
import com.tomlloyd.application.model.music.beat.Beat;
import com.tomlloyd.application.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class Bar<T extends Instrument> {

    private List<Beat<T>> beats;

    public Bar() {
        this.beats = new ArrayList<>();
    }

    public T addBeat() throws InstantiationException, IllegalAccessException {
        Beat<T> beat = new Beat<>();
        this.beats.add(beat);

        return beat.getInstrument();
    }

    public Beat<T> getBeatAtPosition(int position) {
        return this.beats.get(position);
    }

    @Override
    public String toString() {
        return "-- BAR --" + StringUtil.listToString(this.beats);
    }
}
