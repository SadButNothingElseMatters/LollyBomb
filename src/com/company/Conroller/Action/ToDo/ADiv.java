package com.company.Conroller.Action.ToDo;

import com.company.Conroller.Action.Action;
import com.company.Model.Div;


public class ADiv implements Action {

    private Div div;

    public ADiv(Div div) {
        this.div = div;
    }

    @Override
    public void action() {
        div.operation();

    }
}
