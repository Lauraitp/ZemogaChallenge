package com.zemoga.technicalchallenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TextValue implements Question<String>{

	private Target value;
	public TextValue(Target value) {
		this.value=value;
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return value.resolveFor(actor).getTextValue();
	}

	public static TextValue ofTarget(Target value) {
		return new TextValue(value);
	}
}
