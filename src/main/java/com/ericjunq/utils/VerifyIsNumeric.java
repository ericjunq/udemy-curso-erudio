package com.ericjunq.utils;

import org.springframework.stereotype.Component;

@Component
public class VerifyIsNumeric {

    public boolean isNumeric(String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", ".");
        return (number.matches("[-+]?[0-9]*\\.?[0-9]+"));

    }
}
