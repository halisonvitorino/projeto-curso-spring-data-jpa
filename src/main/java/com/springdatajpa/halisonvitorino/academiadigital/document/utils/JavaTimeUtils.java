package com.springdatajpa.halisonvitorino.academiadigital.document.utils;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTimeUtils {

    private JavaTimeUtils(){}

    private static final Locale LOCALE_BR = new Locale("pt", "BR");

    public static final DateTimeFormatter LOCALDATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", LOCALE_BR);
    public static final DateTimeFormatter LOCALDATE_FORMATTER      = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss", LOCALE_BR);
}
