package SeleniumIntroduction.ArnobRahee1;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class testclass {
	 ChromeDriver driver;
@Before
public  void init() throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@Test
public void signup() {
	WebElement createaccount=driver.findElement(By.linkText("Create new account"));
	createaccount.click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='First name']")));
	//first name
	WebElement firstname=driver.findElement(By.cssSelector("[aria-label='First name']"));
	firstname.sendKeys("Arnob");
	//last name
	WebElement lastname=driver.findElement(By.cssSelector(" [aria-label='Last name']"));
	lastname.sendKeys("Rahee");
	//month 
	WebElement month=driver.findElement(By.cssSelector(" [aria-label='Month']"));
	Select selectMonth = new Select(month);
	selectMonth.selectByVisibleText("Oct");
	//day
	WebElement day=driver.findElement(By.cssSelector(" [aria-label='Day']"));
	Select selectday = new Select(day);
	selectday.selectByVisibleText("27");
	//year
	WebElement year=driver.findElement(By.cssSelector(" [aria-label='Year']"));
	Select selectyear = new Select(year);
	selectyear.selectByVisibleText("1997");
	//gender
	WebElement gender=driver.findElement(By.xpath("//label[contains(text(),'Male')]/input[@type='radio']"));
	gender.click();
	//mobile number
	WebElement mobile=driver.findElement(By.cssSelector("[aria-label='Mobile number or email']"));
	mobile.sendKeys("8188524798");
	//password
	WebElement password=driver.findElement(By.cssSelector("[aria-label='New password']"));
	password.sendKeys("rahee1997");
	
	//signup
	WebElement signup=driver.findElement(By.linkText("Sign Up"));
	signup.click();
}


}
