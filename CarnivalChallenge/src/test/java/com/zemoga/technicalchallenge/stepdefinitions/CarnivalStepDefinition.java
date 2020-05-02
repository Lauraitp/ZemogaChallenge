package com.zemoga.technicalchallenge.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static com.zemoga.technicalchallenge.userinterfaces.CarnivalPage.EXIT_PROMO;
import static com.zemoga.technicalchallenge.userinterfaces.ResultCruisesPage.PRICE_OF_EACH_CRUISES;
import static com.zemoga.technicalchallenge.userinterfaces.BookingPage.BOOK_NOW;	

import com.zemoga.technicalchallenge.interations.Wait;
import com.zemoga.technicalchallenge.questions.ChangeResultAfterFilter;
import com.zemoga.technicalchallenge.questions.IsOrdenMinorPriceToMajor;
import com.zemoga.technicalchallenge.questions.ItineraryIs;
import com.zemoga.technicalchallenge.questions.TextValue;
import com.zemoga.technicalchallenge.tasks.FilterPrice;
import com.zemoga.technicalchallenge.tasks.LearnMoreAbout;
import com.zemoga.technicalchallenge.tasks.OpenBrowser;
import com.zemoga.technicalchallenge.tasks.SearchTrip;

public class CarnivalStepDefinition {

	@Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Laura");
    }
	
	@Given("Open the Carnival Home Page")
	public void openTheCarnivalHomePage() {
		theActorInTheSpotlight().wasAbleTo(OpenBrowser.withUrl("https://www.carnival.com/"),
				JavaScriptClick.on(EXIT_PROMO),
				Wait.theTime(1000)
				);
	}

	@When("Search a Cruises sail to (.*) and duration (.*) to filter the price")
	public void searchACruisesSailToTheBahamasAndDurationDaysToFilterThePrice(String sailTo, String duration) {
		theActorInTheSpotlight().attemptsTo(SearchTrip.to(sailTo, duration), FilterPrice.to());
	}

	@Then("Verify that the results decrease with the filter")
	public void verifyThatTheResultsDecreaseWithTheFilter() {
		theActorInTheSpotlight().should(seeThat(ChangeResultAfterFilter.isOk()));
	}

	@Then("the prices are ordered from the cheapest to the most expensive")
	public void thePricesAreOrderedFromTheCheapestToTheMostExpensive() {
		theActorInTheSpotlight().should(seeThat(IsOrdenMinorPriceToMajor.the(PRICE_OF_EACH_CRUISES)));
	}
	
	@When("She looking for all days to the itinerary")
	public void sheLookingForAllDaysToTheItinerary() {
		theActorInTheSpotlight().attemptsTo(LearnMoreAbout.trip());
	}

	@Then("Verify that the itinerary is complete")
	public void verifyThatTheItineraryIsComplete() {
		theActorInTheSpotlight().should(seeThat(ItineraryIs.complete()));
	}

	@Then("Exist a button to Book the trip")
	public void existAButtonToBookTheTrip() {
		theActorInTheSpotlight().should(seeThat(TextValue.ofTarget(BOOK_NOW),Matchers.equalTo("BOOK NOW")));
	}

}
