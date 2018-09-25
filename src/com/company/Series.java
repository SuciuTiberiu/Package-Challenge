package com.company;

public class Series {


    public static long nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n) {
        if(n==0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long fibonacci(int n) {
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fibonacci = 0;
        for (int i = 2; i<=n; i++){
            fibonacci = nMinus1+nMinus2;
            nMinus2 = nMinus1;
            nMinus1 = fibonacci;
        }
        return fibonacci;
    }
}
