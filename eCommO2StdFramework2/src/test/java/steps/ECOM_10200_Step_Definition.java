package steps;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GlobalActions.Autoredirection;
import GlobalActions.MouseHoverAction;
import actionsPerformed.GlobalAction;
import actionsPerformed.PAYMSimOPageActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import pageobjects.MouseHoverPage;
import pageobjects.PAYMSimOPage;


public class ECOM_10200_Step_Definition {
	
	public WebDriver driver;
	  


	    public ECOM_10200_Step_Definition() {
	        driver = Hooks.driver;
	       
	    }
	
	
	@Given("^that I am a acquisition/upgrade customer$")
	public void that_I_am_a_acquisition_upgrade_customer() throws Throwable {
		
		  GlobalAction b1=new GlobalAction();
          String Currenturl= b1.ExecutionURL("o2_home");
	      driver.get(Currenturl);  
	     PageFactory.initElements(driver, MouseHoverPage.class);
		  MouseHoverAction.PayMSimoNavigation();
		  Autoredirection.redirect();
		
	    // Write code here that turns the phrase above into concrete actions
          Thread.sleep(10000);
		
		
	}

	@When("^I land on the Pay monthly sims page$")
	public void i_land_on_the_Pay_monthly_sims_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.o2.co.uk/shop/sim-cards/sim-only-deals/#deviceType=phone&contractLength=P12M" );
	}

	@Then("^I should see (\\d+) tabs - Phone/Tablet and Mobile broadband$")
	public void i_should_see_tabs_Phone_Tablet_and_Mobile_broadband(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.ElementClick2("Phone");
		PAYMSimOPageActions.ElementClick2("Tablet");
		PAYMSimOPageActions.ElementClick2("Mobile broadband");
		
	}

	@And("^the \"([^\"]*)\" tab should be open by default$")
	public void the_tab_should_be_open_by_default(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//vinudeep updated in 28 march 2017
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.ElementEnable();
		
	}

	@When("^I click on the Phone tab$")
	public void i_click_on_the_Phone_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.ElementClick("PhoneTab");
	}

	@Then("^the downward arrow of the tab should be changed to the upward arrow as per given design\\.$")
	public void the_downward_arrow_of_the_tab_should_be_changed_to_the_upward_arrow_as_per_given_design() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //Sikuli framework have to implemented
	}

	@Then("^below the phone tab the contract length tabs of (\\d+) months and (\\d+) days should be displayed to me$")
	public void below_the_phone_tab_the_contract_length_tabs_of_months_and_days_should_be_displayed_to_me(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageFactory.initElements(driver, PAYMSimOPage.class);
		PAYMSimOPageActions.ElementClick2("12 months");
		PAYMSimOPageActions.ElementClick2("30 days");
	}
}
