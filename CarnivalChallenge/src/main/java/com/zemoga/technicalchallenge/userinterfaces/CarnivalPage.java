package com.zemoga.technicalchallenge.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CarnivalPage {

	public static final Target EXIT_PROMO = Target.the("Exit to the promo at init").
			located(By.xpath("//*[@id=\"MainBody\"]/div[2]/div/span"));
	
	public static final Target SAIL_TO_LIST = Target.the("Sail to list").
			located(By.xpath("//*[@id=\"ccl-cruise-search\"]/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ccl-search-bar-expandable-filter/div/ul/li[*]/button"));
	
	public static final Target BUTTON_SAIL_TO =Target.the("Button to Sail to").
			located(By.id("cdc-destinations"));
	
	public static final Target BUTTON_DURATION =Target.the("Button duration Sail").
			located(By.id("cdc-durations"));
	
	public static final Target DURATION_LIST = Target.the("duration list").
			located(By.xpath("//*[@id=\"ccl-cruise-search\"]/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[2]/div/ul/li[*]/button"));
	
	public static final Target BUTTON_SEARCH_CRUISES =Target.the("Button to Search Cruises").
			located(By.xpath("//*[@id=\"ccl-cruise-search\"]/ccl-cruise-search/div[3]/ccl-cruise-search-bar/div/div[2]/div/div[1]/a"));
	                          
	
	private CarnivalPage() {}
}
