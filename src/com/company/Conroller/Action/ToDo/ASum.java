package com.company.Conroller.Action.ToDo;

import com.company.Conroller.Action.Action;
import com.company.Model.Sum;

public class ASum implements Action {
    private Sum sum;

    public ASum(Sum sum) {
        this.sum = sum;
    }

    @Override
    public void action() {
        sum.operation();

    }


}
