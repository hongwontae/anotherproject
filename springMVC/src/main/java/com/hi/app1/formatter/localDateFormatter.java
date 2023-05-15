package com.hi.app1.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class localDateFormatter implements Formatter <LocalDate> {


    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {

        // 사용자가 전달하는 파라미터는(String) => localDate
        return LocalDate.parse(text, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        // LocalDate => String
        return null;
    }
}
