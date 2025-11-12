package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void bfrlogin() {
		WebElement lgclk=driver.findElement(By.id("login2"));
		lgclk.click();
	}
	public void setUname(String uname) {
		WebElement user=driver.findElement(By.xpath("//input[@id='loginusername']"));
		user.clear();
		user.sendKeys(uname);
	}
	public void setPass(String pass) {
		WebElement passw=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		passw.clear();
		passw.sendKeys(pass);
	}
	public void setLoginButton() {
		WebElement loginbtn=driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		loginbtn.click();
		
	}
	public WebElement verifylogin() {
//		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//		WebElement lapclkss=wait.until(driver.findElement(By.linkText("Laptops")));
		WebElement verfy=driver.findElement(By.linkText("Log out"));
		return verfy;
	}
	public void lapclk() {
		//
		WebElement lapclks=driver.findElement(By.linkText("Laptops"));
		lapclks.click();
		WebElement lapclkss=driver.findElement(By.linkText("Sony vaio i5"));
		lapclkss.click();
		WebElement dis=driver.findElement(By.xpath("//div[@id='more-information']"));
		dis.isDisplayed();
	}
	public void addcart() {
		WebElement addcrt=driver.findElement(By.xpath("//a[@onclick='addToCart(8)']"));
		addcrt.click();
	}
	
}
//html/body/div[5]/div/div[1]/div/a[3]
