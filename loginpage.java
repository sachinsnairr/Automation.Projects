package mothersparshpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;


public class loginpage {
	WebDriver driver;
	By loginbtn=By.xpath("//*[@id=\"shopify-section-header\"]/stickyheader/header/div/a[2]");
	By emails=By.id("CustomerEmail");
	By passw=By.id("CustomerPassword");
	By logclick=By.xpath("//*[@id=\"customer_login\"]/button");

public loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}

public void log(String id,String pw) {
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
driver.switchTo().frame("webklipper-publisher-widget-container-surveyframe");
driver.findElement(By.id("survey-close-div")).click();
driver.switchTo().defaultContent();
driver.findElement(loginbtn).click();
JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,150)", "");
 driver.findElement(emails).sendKeys(id);
 driver.findElement(passw).sendKeys(pw);
 driver.findElement(logclick).click();
}
}