package com.tomlloyd.application.model.music.note;

import java.util.List;

public class Note {

    private final int number;
    private final List<NoteProperty> properties;

    public Note(final int number, final List<NoteProperty> properties) {
        this.number = number;
        this.properties = properties;
    }

}
