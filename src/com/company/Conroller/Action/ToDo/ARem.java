package com.company.Conroller.Action.ToDo;

import com.company.Conroller.Action.Action;
import com.company.Model.Rem;

public class ARem implements Action {
private Rem rem;

    public ARem(Rem rem) {
        this.rem = rem;
    }

    @Override
    public void action() {
        rem.operation();

    }
}
