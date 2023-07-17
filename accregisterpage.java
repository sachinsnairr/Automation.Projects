package mothersparshpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class accregisterpage {
	WebDriver driver;
	By fname=By.id("RegisterForm-FirstName");
	By lname=By.id("RegisterForm-LastName");
	By dob=By.id("RegisterForm-dob");
	By email=By.id("RegisterForm-email");
	By pass=By.id("RegisterForm-password");
	By tick =By.id("tc-check");
	By create =By.xpath("//button[@onclick='return true']");

public accregisterpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
public void registration(String firstname,String lastname,String date,String
emailid,String password) {
driver.findElement(fname).sendKeys(firstname);
driver.findElement(lname).sendKeys(lastname);
driver.findElement(pass).sendKeys(password);
driver.findElement(dob).sendKeys(date);
driver.findElement(email).sendKeys(emailid);
driver.findElement(tick).click();
driver.findElement(create).click();

}
}

