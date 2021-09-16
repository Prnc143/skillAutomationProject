package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryFacebookPage 
{

	@FindBy(xpath="//button[@type='submit']")
	private WebElement fbLikeBtn;
	 
	public SkillraryFacebookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fblikebtn()
	{
		fbLikeBtn.click();
	}
	
}
