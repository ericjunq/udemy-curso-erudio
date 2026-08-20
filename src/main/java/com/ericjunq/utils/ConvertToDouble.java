package com.ericjunq.utils;

import com.ericjunq.exceptions.UnsuportedMathOperationException;
import org.springframework.stereotype.Component;

@Component
public class ConvertToDouble {

    public Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if (strNumber == null || strNumber.isEmpty()) throw new UnsuportedMathOperationException("Please set a numeric value");
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }
}
