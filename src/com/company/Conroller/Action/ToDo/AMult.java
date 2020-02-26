package com.company.Conroller.Action.ToDo;

import com.company.Conroller.Action.Action;
import com.company.Model.Mult;

public class AMult implements Action {

    private Mult mult;

    public AMult(Mult mult) {
        this.mult = mult;
    }

    @Override
    public void action() {
        mult.operation();

    }
}
