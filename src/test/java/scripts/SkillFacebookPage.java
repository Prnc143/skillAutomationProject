package scripts;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLogin;
//import pomPages.SkillraryFacebookPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;


public class SkillFacebookPage extends BaseClass
{
	
	@Test
	public void tc3() throws FileNotFoundException, IOException
	{
		SkillraryLoginPage sl= new SkillraryLoginPage(driver);
		sl.gearsButton();
		sl.skillraryDemoapp();
		
		utilies.switchTab(driver);
		
		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		utilies.dropDown(sd.getTestingDropDown(), pdata.getData("courseName")  );
		
		utilies.switchTab(driver);
		
		TestingPage tp = new TestingPage(driver);
	     WebElement ele =  tp.getFbBtn();
		
		Point p = ele.getLocation();
		int x = p.getX();
		int y = p.getY();
		
		utilies.scrollBar(driver, x, y);
		tp.facbookBtn();
		utilies.switchTab(driver);
	    
		//SkillraryFacebookPage sFP = new SkillraryFacebookPage(driver);
		//sFP.fblikebtn();
	}

}
