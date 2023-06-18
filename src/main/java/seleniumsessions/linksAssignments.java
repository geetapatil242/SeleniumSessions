package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linksAssignments {

	static WebDriver driver;

	public static void main(String[] args) {
		// // HW --naveen.... capture all footer links , all 16 using xpath. by creating
		// general function
		// try on fresh works website or any website.

		// open cart Right panel links
		BrowserUtil brUtil = new BrowserUtil();

		driver = brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//brUtil.launchURL("https://www.freshworks.com/?tactic_id=3419392&utm_source={GoogleAdwords}&utm_medium=FWorks-Search-US&utm_campaign=FWorks-Search-US&utm_term=freshworks&device=c&matchtype=e&network=g&gclid=Cj0KCQjwuLShBhC_ARIsAFod4fJcYJ_j5e2Sdcos1be4Bsy7GRZRjKYnnL7TEZ2xbDkwk_hnVUTQi0MaAnWuEALw_wcB&gclid=Cj0KCQjwuLShBhC_ARIsAFod4fJcYJ_j5e2Sdcos1be4Bsy7GRZRjKYnnL7TEZ2xbDkwk_hnVUTQi0MaAnWuEALw_wcB");
		String title = brUtil.getPageTitle();
		

		By rightPanelLinks = By.className("list-group-item");
		By footerLinks = By.xpath("//footer//a");
		// get all the footerlinks using xpath locator
		ElementUtil elUtil = new ElementUtil(driver);
		List <WebElement>footerLinksList= elUtil.getElements(footerLinks);
		List <String> footerLinksText = elUtil.getElementsTextList(footerLinks);
		System.out.println(footerLinksText);
		int footerLinksCount = elUtil.getElementsCount(footerLinks);
		System.out.println(footerLinksCount);
		
		
		//HW --- footer of the google.com
		
		brUtil.launchURL("https://www.google.com/");
		By googleFooterLinks = By.xpath("//a[@class =\"pHiOh\"]");
		List <WebElement>googlefooterLinksList= elUtil.getElements(googleFooterLinks);
		List <String> googlefooterLinksText = elUtil.getElementsTextList(googleFooterLinks);
		System.out.println(googlefooterLinksText);
		int googlefooterLinksCount = elUtil.getElementsCount(googleFooterLinks);
		System.out.println(googlefooterLinksCount);
		
		
		
//		if (getElements(rightPanelLinks).size() == 13) {
//			System.out.println("right panel count is correct = 13");
//
//		}
//		List<String> rightPanelLinksTextList = getElementsTextList(rightPanelLinks);
//		System.out.println(rightPanelLinksTextList);
//		if(rightPanelLinksTextList.contains("My Account")) {
//			System.out.println("My Account --- PASS");
//		}

	}

//	public static List<String> getElementsTextList(By locator) {
//		List<WebElement> elementsLinksList = getElements(locator);
//		List<String> elesTextList = new ArrayList<String>();
//		for (WebElement e : elementsLinksList) {
//			String text = e.getText();
//			elesTextList.add(text);
//		}
//		return elesTextList;
//	}
//
//	public static List<WebElement> getElements(By locator) {
//		return driver.findElements(locator);
//	}

	
	// HW....last in amazon
}
