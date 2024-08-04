import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MTMM {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mtmmmissionhospital.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3500)", "");
		Thread.sleep(2000);
		WebElement getdirecion =driver.findElement(By.xpath("//span[normalize-space()='Get Directions']"));
		getdirecion.click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement arrow=driver.findElement(By.xpath("//body/div[1]/button[1]/i[1]"));
		arrow.click();
		WebElement departments =driver.findElement(By.xpath("//a[contains(text(),'DEPARTMENTS')]"));
		departments.click();
		Thread.sleep(2000);
		WebElement casuality=driver.findElement(By.xpath("//a[contains(text(),'Casualty Department')]"));
	    casuality.click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    //brokenlinks
	    List<WebElement> links = driver.findElements(By.tagName("a"));

	    for(WebElement link:links) {
	    	String url =link.getAttribute("href");
	    	System.out.println(url);
	    	System.out.println(url);	
	    	if(url==null||url.isEmpty()) {
	    		System.out.println("url is empty");
	    		
	    		continue;
	    	}
	    	HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());	
	    	huc.setRequestMethod("HEAD");
	    	huc.connect();
	    int respcode = huc.getResponseCode();
	    if(respcode>=400) {
	    	System.out.println(url+"is a broken");
	    }
	    else {
	    	System.out.println(url+"is a valid link");
	    	
	    	List<WebElement>links1=driver.findElements(By.tagName("a"));
	    	System.out.println("no of links="+links1.size());

	}

}
	    
	}
}
