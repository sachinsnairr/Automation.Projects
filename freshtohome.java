import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class freshtohome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.freshtohome.com/");
WebElement place =driver.findElement(By.id("autoComplete"));
place.sendKeys("Guruvayur");
place.clear();
place.sendKeys("Thrissur");
WebElement Enter=driver.findElement(By.id("autoComplete"));
Enter.sendKeys(Keys.RETURN);

driver.findElement(By.name("q")).sendKeys("fish");
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/span[1]")).click();
driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[2]/div[1]/div[3]/button[1]")).click();

driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'My Cart')]")).click();

driver.findElement(By.xpath("//span[contains(text(),'Continue Shopping')]")).click();

driver.findElement(By.name("q")).sendKeys("chicken");
Thread.sleep(2000);
driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/span[1]")).click();
WebElement item= driver.findElement(By.xpath("//h3[@class='product-name'][text()='Premium Boneless Antibiotic-residue-free Chicken Breast Fillet']"));
item.click();

WebElement addtocart=driver.findElement(By.xpath("//button[@data='https://www.freshtohome.com/premium-fillet-chicken-breast-fillet.html']"));
addtocart.click();

	


	}

}
