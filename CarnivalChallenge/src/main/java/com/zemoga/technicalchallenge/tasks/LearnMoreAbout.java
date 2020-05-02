package com.zemoga.technicalchallenge.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.zemoga.technicalchallenge.userinterfaces.CarnivalPage.BUTTON_SEARCH_CRUISES;
import static com.zemoga.technicalchallenge.userinterfaces.BookingPage.*;
import com.zemoga.technicalchallenge.interations.SeeTheItinerary;
import com.zemoga.technicalchallenge.interations.Wait;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class LearnMoreAbout implements Task{
	
	public LearnMoreAbout() {}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(JavaScriptClick.on(BUTTON_SEARCH_CRUISES));
		actor.remember("daysTrip", NUMBER_OF_DAY.resolveFor(actor).getTextValue());
		actor.attemptsTo(JavaScriptClick.on(LEARN_MORE_TO_CRUISES),
				Wait.theTime(1000),
				SeeTheItinerary.into(LEARN_MORE_ABOUT_EACH_DAY_ODD,true),
				SeeTheItinerary.into(LEARN_MORE_ABOUT_EACH_DAY_EVEN,false)
				);
		
	}
	
	public static LearnMoreAbout trip() {
		return instrumented(LearnMoreAbout.class);
	}

}
