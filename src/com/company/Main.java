package com.company;


import com.company.Conroller.Router;
import com.company.Model.Div;
import com.company.Model.Mult;
import com.company.Model.Rem;
import com.company.Model.Sum;


public class Main {

    public static void main(String[] args) {

        Sum sum = new Sum();
        Rem rem = new Rem();
        Mult mult = new Mult();
        Div div = new Div();
        Router router = new Router();
        router.setModel(sum,rem,mult,div);
        router.generateMap();
        router.input();

    }
}
