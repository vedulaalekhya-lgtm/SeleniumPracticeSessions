package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctions extends BaseClass{
	//WebDriver driver;

		@FindBy(xpath = "//a[@data-group='men']")
		WebElement MenTab;
		public LoginFunctions(WebDriver driver)
		
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void LoginMethod() {
			driver.get("https://www.myntra.com/");
			System.out.println(MenTab.getText());
		}
}
