package Hdfc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hdfc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.hdfcfund.com/");
driver.manage().window().maximize();
WebElement search=driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/form[1]/div[1]/div[1]/div[1]/input[1]"));
search.click();
Thread.sleep(2000);
WebElement close =driver.findElement(By.xpath("//a[@id='closeSearchBtnId']"));
close.click();
WebElement darkmode=driver.findElement(By.xpath("//input[@id='flexSwitchCheckDefault1']"));
Actions actions = new Actions(driver);
Thread.sleep(2000);
actions.doubleClick(darkmode).perform();
WebElement fontsize=driver.findElement(By.xpath("//a[contains(text(),'A-')]"));
fontsize.click();
Thread.sleep(2000);

WebElement fontsizeAminus= driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/ul[2]/li[4]/div[2]/ul[1]/li[2]/a[1]"));
fontsizeAminus.click();
Thread.sleep(2000);

WebElement fontsizeA=driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[2]/div[1]/ul[2]/li[4]/div[2]/ul[1]/li[3]"));
fontsizeA.click();
Thread.sleep(2000);

WebElement fontsizeplus=driver.findElement(By.xpath("//a[contains(text(),'A+')]"));
fontsize.click();
WebElement aboutus=driver.findElement(By.xpath("//p[contains(text(),'About Us')]"));
aboutus.click();
driver.navigate().back();
Thread.sleep(2000);

WebElement learnerscorner=driver.findElement(By.xpath("//p[contains(text(),'Learners’ Corner')]"));
learnerscorner.click();
driver.navigate().back();
Thread.sleep(2000);

WebElement knowledgestack=driver.findElement(By.xpath("//p[contains(text(),'Knowledge Stack')]"));
knowledgestack.click();
Thread.sleep(2000);

WebElement productandsolution=driver.findElement(By.xpath("//p[contains(text(),'Product & Solutions')]"));
productandsolution.click();
Thread.sleep(2000);

WebElement investorservice=driver.findElement(By.xpath("//p[contains(text(),'Investor Services')]"));
investorservice.click();
Thread.sleep(2000);

WebElement distributorcorner=driver.findElement(By.xpath("//p[contains(text(),'Distributor Corner')]"));
distributorcorner.click();

WebElement startsip=driver.findElement(By.xpath("//a[contains(text(),'Start SIP')]"));
startsip.click();
Thread.sleep(2000);
driver.get("https://investor-web.hdfcfund.com/new-investor/kyc-verification");
Thread.sleep(6000);
WebElement panid=driver.findElement(By.xpath("//a[contains(text(),'Start SIP')]"));
panid.sendKeys("NKVPS2328D");

Thread.sleep(3000);

WebElement dob=driver.findElement(By.xpath("//input[@id='dobId']"));
dob.sendKeys("12-10-1998");

driver.findElement(By.xpath("//input[@id='confirmfoliocreate1']")).click();

	}

}
