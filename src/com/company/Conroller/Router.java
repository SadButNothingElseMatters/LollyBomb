package com.company.Conroller;

import com.company.Conroller.Action.Action;
import com.company.Conroller.Action.ToDo.*;
import com.company.Model.Div;
import com.company.Model.Mult;
import com.company.Model.Rem;
import com.company.Model.Sum;
import com.company.View.ShowResult;

import java.util.HashMap;
import java.util.Scanner;


public class Router {

    private Sum sum;
    private Rem rem;
    private Mult mult;
    private Div div;


    public void setModel(Sum sum, Rem rem,Mult mult, Div div) {
        this.sum = sum;
        this.rem = rem;
        this.mult = mult;
        this.div = div;
    }
    HashMap <String, Action> map = new HashMap<String, Action>();
    public void generateMap(){
        map.put("+",new ASum(sum));
        map.put("-",new ARem(rem));
        map.put("*",new AMult(mult));
        map.put("/",new ADiv(div));
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        map.get(symbol).action();
    }

}
