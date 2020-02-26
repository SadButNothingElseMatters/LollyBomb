package com.company.Conroller;

import java.util.Scanner;

public class Input {
    Router router = new Router();
    Scanner scanner = new Scanner(System.in);
    double a,b;

    public double inputA() {
        a = scanner.nextDouble();
        return a;
    }
       public double inputB(){
        b = scanner.nextDouble();
        return b;
    }
}
