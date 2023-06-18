package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments {

	public static void main(String[] args) {
		// place holders of all the fields on register page

		String attrName = "placeholder";
		String value = "value";
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brUtil.getPageTitle();
		System.out.println("page title:" + title);

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By pwd = By.id("input-password");
		By confirmPwd = By.id("input-confirm");

		ElementUtil eleUtil = new ElementUtil(driver);

		String fnPlaceholder = eleUtil.doGetAttributeValue(firstName, attrName);
		System.out.println("First Name placeholder:" + " " + fnPlaceholder);
		String lnPlaceholder = eleUtil.doGetAttributeValue(lastName, attrName);
		System.out.println("Last Name placeholder:" + " " + lnPlaceholder);
		String emailPlaceholder = eleUtil.doGetAttributeValue(email, attrName);
		System.out.println("Email placeholder:" + " " + emailPlaceholder);
		String telephonePlaceholder = eleUtil.doGetAttributeValue(telephone, attrName);
		System.out.println("Telephone placeholder:" + " " + telephonePlaceholder);
		String passwordPlaceholder = eleUtil.doGetAttributeValue(pwd, attrName);
		System.out.println("Password placeholder:" + " " + passwordPlaceholder);
		String confirmpwdPlaceholder = eleUtil.doGetAttributeValue(confirmPwd, attrName);
		System.out.println("Confirm password placeholder:" + " " + confirmpwdPlaceholder);

		// filling the field and then verify the correct data entered
		String fndata = "Divya";
		String lndata = "Doctor";
		String emaildata = "dr@yahoo.com";
		String telephonedata = "911234567";
		String pwddata = "divya123";
		String confirmpwddata = pwddata;

		eleUtil.doVerifyEnteredData(firstName, value, fndata);
		eleUtil.doVerifyEnteredData(lastName, value, lndata);
		eleUtil.doVerifyEnteredData(email, value, emaildata);
		eleUtil.doVerifyEnteredData(telephone, value, telephonedata);
		eleUtil.doVerifyEnteredData(pwd, value, pwddata);
		eleUtil.doVerifyEnteredData(confirmPwd, value, confirmpwddata);

		// find all the links using tagname
		// total number of lists
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		int totalLinks = linkslist.size();
		System.out.println(totalLinks);

		// print the text of each link
		//print along with index
		// skip the link with blank text 
	
		for (int i = 0; i < totalLinks; i++) {
			String text = linkslist.get(i).getText();
			if (text.length()>0) {
				if(!text.isBlank()) { // not sure this is correct way to check blank, confirm
				//System.out.println(i+"="+text);
				}
			}
		}
		
		//for each loop
		int count = 0;
		for(WebElement e: linkslist) {
			String text = e.getText();
			if(text.length()>0) {
				//System.out.println(count+text);
			}
			count++;
		}
		System.out.println("----------------------");
		// fetch the href value of the links
		int linkcount = 0;
		for(WebElement e: linkslist) {
			String linkhref = e.getAttribute("href");
			if (linkslist.size()>0) {
				System.out.println(linkhref);
			}
			linkcount++;
		}
		
		System.out.println("---------------");
		// find all the images and fetch alt and src value
		List<WebElement> imageslist = driver.findElements(By.tagName("img"));
		int totalImages = imageslist.size();
		System.out.println(totalImages);
		int imagecount = 0;
		for(WebElement e: imageslist) {
			String imagetext = e.getAttribute("alt");
			if(imagetext.length()>0) {
				System.out.println(imagecount+"="+imagetext);
			}
			imagecount++;
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int imagecount2 = 0;
		for(WebElement e: imageslist) {
			String imagetext = e.getAttribute("src");
			if(imagetext.length()>0) {
				System.out.println(imagecount2+"="+imagetext);
			}
			imagecount2++;
		}
		
	}
	

}
