package com.zemoga.technicalchallenge.interations;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class SeeTheItinerary implements Interaction {

	private Target itinerary;
	private boolean isodd;

	public SeeTheItinerary(Target itinerary, boolean isodd) {
		this.itinerary = itinerary;
		this.isodd = isodd;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		int count = 0;

		List<WebElementFacade> element = itinerary.resolveAllFor(actor);

		for (int i = 0; i < element.size(); i++) {

			count++;
		}
		if (isodd) {
			actor.remember("odd", count);
		} else {
			actor.remember("even", count);
		}

	}

	public static SeeTheItinerary into(Target itinerary, boolean isodd) {
		return instrumented(SeeTheItinerary.class, itinerary, isodd);
	}
}
