package com.zemoga.technicalchallenge.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ResultCruisesPage {

	public static final Target FILTER_PRICE =Target.the("Button filter pricing").
			located(By.id("sfn-nav-pricing"));
	
	public static final Target SLIDE_BAR_PRICE_EXPENSIVE =Target.the("Slide bar expensive point").
			locatedBy("//*[@id=\"sfc-xfilters\"]/ccl-cruise-search-bar-xfilters-pricing/div/div/div/div[2]/div/div/div/span[4]");
	
	public static final Target RESULTS =Target.the("Results of found").
			locatedBy("//*[@id=\"ccl-refresh-homepage\"]/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div[2]/ccl-cruise-search-bar-count-and-options/div/span[2]");
	
	public static final Target PRICE_OF_EACH_CRUISES =Target.the("Results of found").
			locatedBy("//*[@id=\"ccl-refresh-homepage\"]/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[*]/ccl-view-result-grid-item/div/div[1]/ccl-view-result-grid-footer/div/div[1]/div[2]/div/p[2]/span[2]/span[2]");
	                   
	
	private ResultCruisesPage() {}
}
