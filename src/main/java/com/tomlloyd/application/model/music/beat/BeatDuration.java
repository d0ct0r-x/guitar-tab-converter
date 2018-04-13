package com.tomlloyd.application.model.music.beat;

import com.tomlloyd.application.model.music.beat.enums.Dotting;
import com.tomlloyd.application.model.music.beat.enums.Duration;

public class BeatDuration {

    private final Duration duration;
    private final Dotting dotting;

    public BeatDuration(final Duration duration, final Dotting dotting) {
        this.duration = duration;
        this.dotting = dotting;
    }

    public BeatDuration(final Duration duration) {
        this(duration, Dotting.NONE);
    }

    public BeatDuration() {
        this(Duration.EIGHTH, Dotting.NONE);
    }

    public Duration getDuration() {
        return duration;
    }

    public Dotting getDotting() {
        return dotting;
    }
}
