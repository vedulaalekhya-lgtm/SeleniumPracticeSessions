package javaPracticeSessions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumSessions {
	WebDriver driver;
	
	public SeleniumSessions(WebDriver driver) {
		this.driver=driver;
	}
	
	public void getLabels(List<WebElement> tabListMenu) {
		for (int i = 0; i < tabListMenu.size(); i++) 
		{
			WebElement flipkartTabs = tabListMenu.get(i);
			String TabList = flipkartTabs.getText();
			System.out.println(TabList);
		}
	}
	public void mouseHover(List<WebElement> submenu) {
		Actions actions = new Actions(driver);
		for (int i = 0; i < submenu.size(); i++) 
		{
			actions.moveToElement(submenu.get(i)).perform();
			System.out.println("Hello Git commenting");
		}
		
	}
}
