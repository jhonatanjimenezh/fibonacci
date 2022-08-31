package com.controlhub.services;

import org.springframework.stereotype.Service;

@Service
public class FibonacciServiceImp implements FibonacciService {

    @Override
   public Integer getIndexFibonacci(Integer index){
       return getFibonacciNumber(index);
   }

    public  int getFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
        }
    }
}
