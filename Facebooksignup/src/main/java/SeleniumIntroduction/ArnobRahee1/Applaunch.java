package SeleniumIntroduction.ArnobRahee1;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Applaunch {
	@Test
	public void testcase1() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/**Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		**/
		driver.manage().window().maximize();
		WebElement createaccount=driver.findElement(By.linkText("Create new account"));
		createaccount.click();
		Thread.sleep(3000);
		WebElement drop=driver.findElement(By.id("month"));
		Select s=new Select(drop);
		s.selectByVisibleText("May");
		s.selectByIndex(7);
		
	}
	public static void main(String[] args) throws InterruptedException {
		Applaunch ap=new Applaunch();
		ap.testcase1();
	}


}
