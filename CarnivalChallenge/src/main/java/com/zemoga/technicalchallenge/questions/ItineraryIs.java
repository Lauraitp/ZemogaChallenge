package com.zemoga.technicalchallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
public class ItineraryIs implements Question<Boolean> {
	
	public ItineraryIs() {
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		
		
		int daysOdd=actor.recall("odd");
		int dayEven=actor.recall("even");
		int daysTrip= Integer.parseInt(actor.recall("daysTrip"));
	
		
		if(daysTrip+1==daysOdd+dayEven) {
			return true;
		}else {
			return false;
		}
	}

	public static ItineraryIs complete() {
		return new ItineraryIs();
	}
}
