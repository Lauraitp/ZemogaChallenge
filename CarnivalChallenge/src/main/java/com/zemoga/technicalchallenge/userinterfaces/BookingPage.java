package com.zemoga.technicalchallenge.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class BookingPage {

	public static final Target NUMBER_OF_DAY = Target.the("Watch number of days").
			located(By.xpath("//*[@id=\"ccl-refresh-homepage\"]/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[1]/ccl-view-result-grid-item/div/ccl-cruise-search-glance/a/span/span/span[1]/span/span"));
	
	public static final Target LEARN_MORE_TO_CRUISES = Target.the("Button Learn More").
			located(By.xpath("//*[@id=\"ccl-refresh-homepage\"]/div/div/div/div/div/ccl-cruise-search/div[3]/ccl-view-result-container/div/ccl-view-result-grid/article[1]/ccl-view-result-grid-item/div/div[1]/ccl-view-result-grid-footer/div/div[2]/a"));
	
	public static final Target LEARN_MORE_ABOUT_EACH_DAY_ODD = Target.the("Watch itinerary days odd").
			located(By.xpath("//*[@id=\"details\"]/div[3]/div[*]/div[1]/div/div/button"));
	
	public static final Target LEARN_MORE_ABOUT_EACH_DAY_EVEN = Target.the("Watch itinerary days even").
			located(By.xpath("//*[@id=\"details\"]/div[3]/div[*]/div[2]/div/div/button"));
	
	public static final Target BOOK_NOW = Target.the("Book now").
			located(By.xpath("//*[@id=\"sm-booking-btn\"]/booking-button/div/span/span/span[4]/span"));
	
	
	private BookingPage() {}
}
