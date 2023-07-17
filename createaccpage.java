package mothersparshpage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class createaccpage {
	WebDriver driver;
	By loginbtn=By.xpath("//*[@id=\"shopify-section-header\"]/stickyheader/header/div/a[2]");
	By createacc=By.xpath("//*[@id=\"customer_login\"]/a[2]");


public createaccpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
public void account () {
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	 
	 driver.switchTo().frame("webklipper-publisher-widget-container-surveyframe");
	 driver.findElement(By.id("survey-close-div")).click();
	 driver.switchTo().defaultContent();
	  driver.findElement(loginbtn).click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,250)", "");
	  driver.findElement(createacc).click();
	 }
	 }

