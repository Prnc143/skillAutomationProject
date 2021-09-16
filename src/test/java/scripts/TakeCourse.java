package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddCoursePage;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPage;

public class TakeCourse extends BaseClass
{
	
	@Test
	public void tc2() throws FileNotFoundException, IOException, InterruptedException
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.searchBox(pdata.getData("searchBox"));  
		s.searchBtn();
		
		SeleniumPage sp = new SeleniumPage(driver);
		sp.SeleniCoreJava();
		
		
		AddCoursePage cp = new AddCoursePage(driver);
		cp.acpt();
		utilies.switchFrame(driver);
	    cp.play();
		Thread.sleep(10000);
		cp.pause();
		utilies.switchBackFrame(driver);
		cp.takeCourse();
		
		Assert.assertEquals(driver.getCurrentUrl(),pdata.getData("loginUrl"));
		
	}
	
}
	
	

