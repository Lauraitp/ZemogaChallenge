package com.zemoga.technicalchallenge.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.zemoga.technicalchallenge.interations.MoveSlideBar;
import com.zemoga.technicalchallenge.interations.Wait;

import static com.zemoga.technicalchallenge.userinterfaces.ResultCruisesPage.*;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class FilterPrice implements Task{

	public FilterPrice() {
		
	}
	
	@Step("{0} Filts to prices")
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Click.on(FILTER_PRICE),
				MoveSlideBar.into(SLIDE_BAR_PRICE_EXPENSIVE, 8),
				Wait.theTime(2000));
		
	}

	public static FilterPrice to() {
		return instrumented(FilterPrice.class);
	}
}
