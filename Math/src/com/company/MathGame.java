package com.company;

import java.util.Random;

public class MathGame {

int res;
    public void Result(int a, int b,int c){


        switch (c) {
            case 0 -> {
                res = a+b;
                System.out.println(a + " + " + b + "=");
            }
            case 1 -> {
                res = a-b;
                System.out.println(a + " - " + b + "=");

            }
            case 2 -> {
                res = a*b;
                System.out.println(a + " * " + b+ "=");

            }
            case 3 -> {
                res = a/b;
                System.out.println(a + " / " + b + "=");

            }
    }


}}
