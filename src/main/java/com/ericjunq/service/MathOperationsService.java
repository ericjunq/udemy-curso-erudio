package com.ericjunq.service;

import com.ericjunq.exceptions.UnsuportedMathOperationException;
import com.ericjunq.utils.ConvertToDouble;
import com.ericjunq.utils.VerifyIsNumeric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MathOperationsService {

    @Autowired
    private ConvertToDouble convertToDouble;

    @Autowired
    private VerifyIsNumeric isNumeric;

    // ----------------------------------------------------------------------------------------------------------

    public Double sum(
            String numberOne,
            String numberTwo
    ) throws Exception{
        if(!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value");
        return convertToDouble.convertToDouble(numberOne) + convertToDouble.convertToDouble(numberTwo);
    }

    // ----------------------------------------------------------------------------------------------------------

    public Double subtraction(
            String numberOne,
            String numberTwo
    ) throws Exception{
        if(!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value");
        return convertToDouble.convertToDouble(numberOne) - convertToDouble.convertToDouble(numberTwo);
    }

    // ----------------------------------------------------------------------------------------------------------

    public Double division(
            String numberOne,
            String numberTwo
    ) throws Exception{
        if(!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value");
        if (numberTwo.equals("0")) throw new UnsuportedMathOperationException("Division by zero unsupported");
        return convertToDouble.convertToDouble(numberOne) / convertToDouble.convertToDouble(numberTwo);
    }

    // ----------------------------------------------------------------------------------------------------------

    public Double mean(
            String numberOne,
            String numberTwo
    ) throws Exception{
        if(!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo))
            throw new UnsuportedMathOperationException("Please set a numeric value");
        return (convertToDouble.convertToDouble(numberOne) + convertToDouble.convertToDouble(numberTwo)) / 2;
    }

    // ----------------------------------------------------------------------------------------------------------

    public Double squareroot(
            String number
    )throws Exception{
        if(!isNumeric.isNumeric(number))
            throw new UnsuportedMathOperationException("Please set a numeric value");

        if (Double.parseDouble(number) < 0)
            throw new UnsuportedMathOperationException("There's no squareroot result for negative numbers");


        return Math.sqrt(convertToDouble.convertToDouble(number));
    }
}
