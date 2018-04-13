package com.tomlloyd.application.util;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    public static <T> String listToString(List<T> list) {
        if (list.isEmpty()) {
            return "";
        }

        String newline = System.lineSeparator();

        return newline + list.stream()
                .map(Object::toString)
                .collect(Collectors.joining(newline));
    }
}
