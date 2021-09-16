package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	
	@FindBy(xpath="//a[@title='Core Java For Selenium Training']")
	private WebElement seleniCoreJava ;
			
	public SeleniumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void SeleniCoreJava()
	{
		seleniCoreJava.click();
	}
}
