package actionsPerformed;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.DataHelper;
import steps.Hooks;

public class PaymentPageActions {
	
		  
	  public static void Set_Bank_details()
	  {
		  
		  pageobjects.PaymentPage.Name_On_Account.sendKeys("Test Accepta");
		  pageobjects.PaymentPage.Account_Number.sendKeys("10207136");
		  pageobjects.PaymentPage.Sort_Code1.sendKeys("20");
		  pageobjects.PaymentPage.Sort_Code2.sendKeys("15");
		  pageobjects.PaymentPage.Sort_Code3.sendKeys("96");
		  pageobjects.PaymentPage.Accept_Terms_Checkbox.click();
		  
		   }
	  
	  
	  public static void Time_At_Address()
	  {
		  
		  pageobjects.PaymentPage.Stay_Address_Years.sendKeys("6");
		  pageobjects.PaymentPage.Stay_Address_months.sendKeys("2");
		  pageobjects.PaymentPage.Confirm_Address_Checkbox.click();
		  
	  }
	  
	  public static void Card_Details()
	  {
		  pageobjects.PaymentPage.Name_On_Card.sendKeys("Test Accepta");
		  pageobjects.PaymentPage.Card_Number.sendKeys("4539791001730106");
		  pageobjects.PaymentPage.Expiry_Month.sendKeys("01");
		  pageobjects.PaymentPage.Expiry_Year.sendKeys("2016");
		  pageobjects.PaymentPage.CVV_Security_Code.sendKeys("1234");
		  pageobjects.PaymentPage.Continue_Next_Step.sendKeys(Keys.ENTER);
		  
	  }
	  
	  
	  
	  
	  
}
