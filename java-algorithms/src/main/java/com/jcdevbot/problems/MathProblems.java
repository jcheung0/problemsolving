package com.jcdevbot.problems;

import java.math.BigInteger;
/**
 * Created by jcheung on 6/11/16.
 */
public class MathProblems {

    public BigInteger calculateFactrial(int num){

        BigInteger number = new BigInteger("1");

        for(int i = 2; i <= num; i++){
           number =  number.multiply(BigInteger.valueOf(i));
        }
        return number;
    }

    public int divide(int divider, int divisor){
        int quotient = 0;
        if(divisor == 0){
            return -1;
        }else{
            while(divider > 0){
                divider = divider - divisor;
                quotient++;
            }
        }

        return quotient;

    }

    public int divideUsingBits(int divider, int divisor){
        int quotient = 0;
        if(divisor == 0){
            return -1;
        }else{
            while(divider > 0){
                divider = divider - divisor;
                quotient++;
            }
        }

        return quotient;
    }

    public int gcdEuclide(int a, int b){

        if(b == 0){
            return a;
        }else{
            return gcdEuclide(b,a%b);

        }
    }

    /*public int gcd(int a, int b){

    }*/

    public int candy(int[] ratings){
        if(ratings == null || ratings.length == 0){
            return 0;
        }
        int [] candies = new int[ratings.length];
        candies[0] = 1;
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i - 1]){
                candies[i] = candies[i - 1] + 1;
            }else{
                candies[i] = 1;
            }
        }

        for(int i = ratings.length - 2; i >= 2; i--){
            int cur = 1;
            if(ratings[i] > ratings[i + 1]){
                cur = candies[i + 1] + 1;
            }

            cur = Math.max(cur, candies[i]);
            candies[i] = cur;
        }
        int result = candies[ratings.length - 1];

        return result;
    }

}
