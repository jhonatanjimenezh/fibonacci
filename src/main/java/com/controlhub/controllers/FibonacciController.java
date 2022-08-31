package com.controlhub.controllers;

import com.controlhub.services.FibonacciService;
import com.controlhub.services.FibonacciServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlhub")
public class FibonacciController {

    @Autowired
    private FibonacciService fibonacciService;

    @GetMapping("/fibonacci/{index}")
    Integer getValueFibonacci(@PathVariable() Integer index){
        return fibonacciService.getIndexFibonacci(index);
    }

}
