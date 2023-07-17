package mothersparshpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class baseclass {
	protected WebDriver driver;
	public baseclass(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	@BeforeClass
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://mothersparsh.com");
	driver.manage().window().maximize();

}
}
