package com.company.Model;

import com.company.Conroller.Input;
import com.company.Conroller.Output;

public class Mult extends Operations{
    Output output = new Output();
    Input input = new Input();
    double result,a,b;

    @Override
    public void operation() {
        a = input.inputA();
        b = input.inputB();
        result = a*b;
        output.getData(result);
    }
}
