package com.upasana.app;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {



    @GetMapping("/add")
    public double add(@RequestParam("a") double a, @RequestParam("b") double b)
    {
        return a+b;
    }

    @GetMapping("/sub")
    public double sub(@RequestParam("a") double a, @RequestParam("b") double b)
    {
        return a-b;
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam("a") double a, @RequestParam("b") double b)
    {
        return a*b;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam("a") double a, @RequestParam("b") double b)
    {
        return a/b;
    }



}
