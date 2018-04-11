package ProjSpring;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class Range {


    private int lower;
    private int upper;


    public String helloWorld() {
        return "Hello World";
    }

    public Range(int lower, int upper){
        if (lower > upper){
            throw new IllegalArgumentException("lower > upper");
        }
        this.lower = lower;
        this.upper = upper;
    }

    public boolean isInRange(int n){
        return n > lower && n < upper;
    }

    public int add(int a, int b){
        return a+b;
    }

    public String fizzBuzz(int n){

        if (n%5==0 && n%3==0) return "FizzBuzz";
        else if (n%3==0) return "Fizz";
        else if (n%5==0) return "Buzz";
        else return String.valueOf(n);
    }



    public static void main(String[] args) {

        Range range = new Range(33,44);
        System.out.println(range.isInRange(341));

        System.out.println(range.fizzBuzz(45));

    }
}
