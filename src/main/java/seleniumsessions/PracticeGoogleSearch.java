package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeGoogleSearch {
	static WebDriver driver;

	public static void googleSearchMethod(By locator, String searchWord, By suggestionsLocator, String suggestionName) throws InterruptedException {
		driver.findElement(locator).sendKeys(searchWord);
		Thread.sleep(3000);
		List<WebElement> suggestionsList = driver.findElements(suggestionsLocator);
		System.out.println("Total suggestions:" + suggestionsList.size());
		if (suggestionsList.size() > 0) {
			for (WebElement e : suggestionsList) {
				String text = e.getText();
				System.out.println(text);
				if (text.length() > 0) {
					if (text.contains(suggestionName)) {
						e.click();
						break;
					}
				}
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {
		// launch the URL
		// find the locator
		// type a search word/suggestion
		// fetch the list of suggestions displayed
		// click on desire suggestion
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By googleSearchLocator = By.name("q");
		String searchWord = "java selenium";
		String suggestionName = "interview";
		By suggestionsLocator = By.xpath("//div[@class =\"wM6W7d\"]/span");
		googleSearchMethod(googleSearchLocator, searchWord, suggestionsLocator, suggestionName);
		
	}

}
