package testPracticeWithZoho;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ZohoTestClass {
WebDriver driver;
@BeforeMethod
public void DriverSetUp()
{
driver = new ChromeDriver();
driver.get("https://www.zoho.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@Test
public void Signup()
{
WebElement Signup = driver.findElement(By.xpath("//a[@class='zgh-signup' and text()='Sign Up']"));
Signup.click();
WebElement Email = driver.findElement(By.xpath("//input[@aria-label='Email']"));
Email.sendKeys("abc.zoho@gmail.com");
String ReturnText = Email.getAttribute("value");
System.out.println(ReturnText);
WebElement Password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
Password.sendKeys("A1234!@#");
WebElement ShowPassword = driver.findElement(By.xpath("//button[@class='zpassword-show']"));
ShowPassword.click();
WebElement MobileNumber = driver.findElement(By.xpath("//input[@id='rmobile']"));
MobileNumber.sendKeys("9665879468");
WebElement TermsCheckBox = driver.findElement(By.xpath("//input[@id='tos']"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView", TermsCheckBox);
js.executeScript("arguments[0].click()", TermsCheckBox);

}
}
