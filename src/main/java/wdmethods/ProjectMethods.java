package wdmethods;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectMethods extends GenreicMethods {
	@BeforeSuite
	public void initiate()
	{
		start();
	}
	
	@BeforeTest
	public void run()
	{
		openWebsite();
		screenMaximizer();
		pageDetails();
	}
	
	@AfterSuite
	public void finish()
	{
		allbrowsersClose();
	}

}
