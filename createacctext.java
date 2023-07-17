package MothersparshText;

import org.testng.annotations.Test;
import mothersparshpage.accregisterpage;
import mothersparshpage.baseclass;
import mothersparshpage.createaccpage;

public class createacctext extends baseclass{

@Test
public void Testing()
{
	createaccpage ob=new createaccpage(driver);
	ob.account();
	
	accregisterpage ob1=new accregisterpage(driver);
	ob1.registration("sachin","s","9497654157","sachu1037@gmail.com","password123");
}
}
