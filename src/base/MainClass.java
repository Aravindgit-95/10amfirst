package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;

public class MainClass extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("https://www.amazon.in/");
		WebElement f = driver.findElement(By.id("twotabsearchtextbox"));
		click(f);
		enter(f, "lenovo laptop");
		Thread.sleep(4000);
		WebElement f1 = driver.findElement(By.id("(//input[@type='submit'])[1]"));
		click(f1);
	}
	

}
