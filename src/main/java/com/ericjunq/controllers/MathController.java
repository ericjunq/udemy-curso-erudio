package com.ericjunq.controllers;

import com.ericjunq.service.MathOperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private MathOperationsService operations;

    // ----------------------------------------------------------------------------------------------------------

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws Exception{
        return operations.sum(numberOne, numberTwo);
    }

    // ----------------------------------------------------------------------------------------------------------

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws Exception{
        return operations.subtraction(numberOne, numberTwo);
    }

    // ----------------------------------------------------------------------------------------------------------

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws Exception{
        return operations.division(numberOne, numberTwo);
    }

    // ----------------------------------------------------------------------------------------------------------

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable(name = "numberOne") String numberOne,
            @PathVariable(name = "numberTwo") String numberTwo
    ) throws Exception{
        return operations.mean(numberOne, numberTwo);
    }

    // ----------------------------------------------------------------------------------------------------------

    @RequestMapping("/squareroot/{number}")
    public Double squareroot(
            @PathVariable(name = "number") String number)
            throws Exception{
        return operations.squareroot(number);
    }

}
