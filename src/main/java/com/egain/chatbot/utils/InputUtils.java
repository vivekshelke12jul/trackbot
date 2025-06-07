package com.egain.chatbot.utils;

import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class InputUtils {
    private static final Pattern ORDER_ID_PATTERN = Pattern.compile("^[A-Z]{3}\\d{4}$");

    public static boolean isValidOrderId(String input) {
        return ORDER_ID_PATTERN.matcher(input).matches();
    }
}