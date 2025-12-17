package base;
import org.testng.annotations.Test;

public class HomePageTesting extends BaseClass
{

		@Test
		public void myntra_home() {
			LoginFunctions loginPage = new LoginFunctions(driver);
			loginPage.LoginMethod();
		}
	
}




