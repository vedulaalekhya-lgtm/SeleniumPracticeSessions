package javaPracticeSessions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumPractice {

	// As driver is declared as a class level variable, it can be used in any
	// annotation, line @beforeMethod or @AfterMethod
	WebDriver driver;
	@Test
	public void seleniumWebElements() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		SeleniumSessions Label = new SeleniumSessions(driver);
		List<WebElement> flipkartList = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']//*[@aria-label]"));
		Label.getLabels(flipkartList);
		List<WebElement> FashionList = driver.findElements(By.xpath("//div[@aria-label]"));
		Label.mouseHover(FashionList);
		WebElement FAQ = driver.findElement(By.xpath("//a[@aria-label='FAQ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",FAQ);
		js.executeScript("arguments[0].click()",FAQ);
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Runs before Test mthod");
	}
	@AfterClass
	public void bAfterClass() {
		System.out.println("Runs after Test class");
	}
	//@AfterMethod
	//public void afterMethod() {
		//driver.quit();
		//System.out.println("Runs after Test mthod");

	//}

	// Label.getLabels(FashionList);
	// List<WebElement> TopDealsList =
	// driver.findElements(By.xpath("//a[@class='_3n8fna1co _3n8fna10j _3n8fnaod
	// _3n8fna1 _3n8fnac7 _1i2djtb9']//div[text()=\"Top picks of the sale\"]"));
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// System.out.println(TopDealsList.size());
	// Label.getLabels(TopDealsList);

	@BeforeClass
	public void beforeClass() {
		System.out.println("Runs before Test Class");
	}

}