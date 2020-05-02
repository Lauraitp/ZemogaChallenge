package com.zemoga.technicalchallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ChangeResultAfterFilter implements Question<Boolean>{

	public ChangeResultAfterFilter() {}
	
	@Override
	public Boolean answeredBy(Actor actor) {
		int before =actor.recall("beforeFilter");
		int after =actor.recall("afterFilter");
		
		if(before>after) {
			return true;
		}else {
			return false;
		}
	}

	public static ChangeResultAfterFilter isOk() {
		return new ChangeResultAfterFilter();
	}
}
