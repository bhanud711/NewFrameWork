package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdmethods.ProjectMethods;

public class HRMLoginPage extends ProjectMethods {
public HRMLoginPage()
{
	PageFactory.initElements(driver, this);
}

@FindBy(how=How.XPATH,using="//input[@name='txtUsername']")
public WebElement username;

public HRMLoginPage eneterUsername(String data)
{
	type(username,data);
	return this;
}

@FindBy(how=How.XPATH,using="//input[@name='txtPassword']")
public WebElement password;

public HRMLoginPage eneterPassword(String data)
{
	type(password,data);
	return this;
}


@FindBy(how=How.XPATH,using="//input[@name='Submit']")
public WebElement login;

public HRMHomePage loginButton()
{
	button(login);
	return new HRMHomePage();
}

}
