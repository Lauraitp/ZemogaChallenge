package com.zemoga.technicalchallenge.interations;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class Wait implements Interaction {
	
    private int var;


    protected Wait(int var) {
        this.var = var;
    }

    
    @Step("{0} waits this moment '#var' in miliseconds")
    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(var);
    }

 

    public static Wait theTime(int var) {
        return Tasks.instrumented(Wait.class, var);
    }
}
