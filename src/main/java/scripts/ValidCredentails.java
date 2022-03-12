package scripts;

import org.testng.annotations.Test;

import page.HRMHomePage;
import page.HRMLoginPage;
import wdmethods.ProjectMethods;

public class ValidCredentails extends ProjectMethods{
	@Test
	public void authentication()
	{
		new HRMLoginPage()
		.eneterUsername("Admin")
		.eneterPassword("admin123")
		.loginButton();
		
	}
}
