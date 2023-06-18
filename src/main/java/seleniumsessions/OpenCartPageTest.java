package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartPageTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println("page title:" + title);
		
		System.out.println(brUtil.getPageURL());
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By confirmPwd = By.id("input-confirm");
		By policy = By.name("agree");
		By contButton = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By regSuccess = By.cssSelector("#content > h1");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Divya");
		eleUtil.doSendKeys(lastName, "Raghuvanshi");
		eleUtil.doSendKeys(email, "Divya@gmail.com");
		eleUtil.doSendKeys(telephone, "919827270");
		eleUtil.doSendKeys(pwd, "appi@123");
		eleUtil.doClick(policy);
		eleUtil.doSendKeys(confirmPwd, "appi@123");
		eleUtil.doClick(contButton);
		//Thread.sleep(5000);
		
		//brUtil.quitBrowser();
		//HW -- create accout then verify Account created text with if else condition.
		
		String text1 = eleUtil.doGetElementText(regSuccess);
		System.out.println(text1);
		if (text1.equals("Your Account Has Been Created!")){
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//HW fill form, get filled values, also get place holder text before filling the form --- getattribute (placeholder), getattribute(value)
	
		
		
	// HW -- get all links, skip blank or only space
		
		//HW---total images on amazon.com  -- img tag
	
	}


}