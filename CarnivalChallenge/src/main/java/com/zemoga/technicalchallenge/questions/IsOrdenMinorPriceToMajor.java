package com.zemoga.technicalchallenge.questions;


import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class IsOrdenMinorPriceToMajor implements Question<Boolean>{
	
	private Target listOfPrices;

	public IsOrdenMinorPriceToMajor(Target listOfPrices) {
		
		this.listOfPrices = listOfPrices;
	}

	
	@Override
	public Boolean answeredBy(Actor actor) {
		
		boolean isOrder=true;
		
		List<WebElementFacade> allPrices=listOfPrices.resolveAllFor(actor);
		for (int i=0; i<allPrices.size()-1 && isOrder==true;i++) {


			int valuePriceCurrent = Integer.parseInt(allPrices.get(i).getTextValue());
			int valuePriceNext = Integer.parseInt(allPrices.get(i+1).getTextValue());
	

			if (valuePriceCurrent<=valuePriceNext) {
				isOrder=true;

			}else {
				isOrder=false;
			}
		}
		
		return isOrder;
	}
	
	public static IsOrdenMinorPriceToMajor the(Target list) {
		return new IsOrdenMinorPriceToMajor(list);
	}
	

}
