package com.tomlloyd.application;

import com.tomlloyd.application.model.instrument.impl.Guitar;
import com.tomlloyd.application.model.music.Track;

public class App {

    public static void main( String[] args ) throws Exception {

        Track<Guitar> track = new Track<>();
        track.addBar();
        track.addBar();
        track.getBarAtPosition(0).addBeat();
        track.getBarAtPosition(0).addBeat();
        track.getBarAtPosition(1).addBeat();

        System.out.println(track);



    }
}
