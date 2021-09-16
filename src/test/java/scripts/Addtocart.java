package scripts;

import java.io.FileNotFoundException; 
import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Addtocart extends  BaseClass
{
	@Test
	public void tc1() throws FileNotFoundException, IOException 
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();
		utilies.switchTab(driver);
		
		SkillraryDemoLogin d= new SkillraryDemoLogin(driver);
		utilies.mouseHover(driver, d.getCoursebtn());
		d.seleniumTrainingBtn();
		
		AddtocartPage a = new AddtocartPage(driver);
		utilies.doubleClick(driver, a.getAddbtn());
		a.addcartBtn();
		utilies.alertpopup(driver);
		
		Assert.assertEquals( driver.getTitle(), pdata.getData("AddtoCartTitle"));
		Reporter.log(driver.getTitle());
		
	}
}
