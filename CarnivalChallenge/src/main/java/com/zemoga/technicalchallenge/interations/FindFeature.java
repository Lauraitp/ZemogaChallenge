package com.zemoga.technicalchallenge.interations;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindFeature implements Interaction {

	private Target list;
	private String id;

	public FindFeature(Target list, String id) {

		this.list = list;
		this.id = id;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		Wait.theTime(3000);

		for (WebElementFacade element : list.resolveAllFor(actor)) {

			String valueId = element.getTextValue();

			if (id.equals(valueId)) {
				element.waitUntilClickable();
				element.click();

			}
		}
		actor.remember("id", id);

	}

	public static FindFeature forSelect(Target list, String idAction) {
		return instrumented(FindFeature.class, list, idAction);
	}

}

