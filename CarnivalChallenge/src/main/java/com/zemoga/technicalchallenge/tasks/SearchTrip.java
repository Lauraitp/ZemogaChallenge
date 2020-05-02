package com.zemoga.technicalchallenge.tasks;


import static com.zemoga.technicalchallenge.userinterfaces.CarnivalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.thucydides.core.annotations.Step;
import com.zemoga.technicalchallenge.interations.FindFeature;
import com.zemoga.technicalchallenge.interations.Wait;

public class SearchTrip implements Task{
	
	private String sailTo;
	private String duration;

	public SearchTrip(String sailTo, String duration) {
		
		this.sailTo = sailTo;
		this.duration = duration;
	}

	@Step("{0} searches cruises to '#sailTo' and duration '#duration'")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				JavaScriptClick.on(BUTTON_SAIL_TO),
				FindFeature.forSelect(SAIL_TO_LIST, sailTo),
				JavaScriptClick.on(BUTTON_DURATION),
				FindFeature.forSelect(DURATION_LIST, duration),
				Wait.theTime(1000),
				JavaScriptClick.on(BUTTON_SEARCH_CRUISES)
				);
	}

	public static SearchTrip to(String sailTo, String duration) {
		return instrumented(SearchTrip.class,sailTo,duration);
	}
	
}
