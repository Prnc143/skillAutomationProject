package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCoursePage {

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playBtn ;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseBtn ;
	
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement takeCourseBtn ;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement accept;
	public AddCoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void acpt()
	{
		accept.click();
	}
	
	public void play()
	{
		playBtn.click();
	}
	public void pause()
	{
		pauseBtn.click();
	}
	public void takeCourse()
	{
		takeCourseBtn.click();
	}
	
}
