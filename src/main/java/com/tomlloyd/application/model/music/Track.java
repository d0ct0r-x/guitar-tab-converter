package com.tomlloyd.application.model.music;

import com.tomlloyd.application.model.instrument.Instrument;
import com.tomlloyd.application.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

public class Track<T extends Instrument> {

    private List<Bar<T>> bars;

    public Track() {
        this.bars = new ArrayList<>();
    }

    public Bar<T> addBar() {
        Bar<T> bar = new Bar<>();
        this.bars.add(bar);

        return bar;
    }

    public Bar<T> getBarAtPosition(int position) {
        return this.bars.get(position);
    }

    @Override
    public String toString() {
        return "==== TRACK ====" + StringUtil.listToString(this.bars);
    }
}
