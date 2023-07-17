package MothersparshText;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import mothersparshpage.baseclass;
import mothersparshpage.loginpage;
import page.Loginpage;

public class Lognpagetest  extends baseclass {
	
	@Test
	public void test()  {
		Loginpage ob=new Loginpage(driver);

ob.enteremail("sachu1037@gamil.com");
ob.enterpass("password123");
}
}
