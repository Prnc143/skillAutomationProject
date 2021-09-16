package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	
	@FindBy(id="add")
	private WebElement addbtn ;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement addtoCartBtn ;
	
	//driver.switchTo().alert().accept();
	
	public AddtocartPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void addcartBtn()
	{
		addtoCartBtn.click();
	
	}

}
