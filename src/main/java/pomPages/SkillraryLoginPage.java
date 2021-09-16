package pomPages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;

	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoapp;
	
	@FindBy(name="q")
	private WebElement searchBox ;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchBtn ;
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gearsButton()
	{
		gearsbtn.click();
	}
	public void skillraryDemoapp()
	{
		skillraryDemoapp.click();
	}
	public void searchBox(String key)
	{
		searchBox.sendKeys(key);
	}
	public void searchBtn()
	{
		searchBtn.click();
	}
	 
}
