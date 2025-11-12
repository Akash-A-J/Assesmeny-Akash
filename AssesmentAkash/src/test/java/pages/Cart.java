package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	WebDriver driver;
	public Cart(WebDriver driver) {
		this.driver=driver;
	}
	public void cartPage() {
		WebElement crt=driver.findElement(By.xpath("//a[@id='cartur']"));
		crt.click();
	}
	public void placeOrder() {
		WebElement order=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		order.click();
	}
	public void buyername(String bname) {
		WebElement buyer=driver.findElement(By.xpath("//input[@id='name']"));
		buyer.sendKeys(bname);
	}
	public void buyercount(String cname) {
		WebElement buyercon=driver.findElement(By.xpath("//input[@id='country']"));
		buyercon.sendKeys(cname);
	}
	public void buyercity(String ciname) {
		WebElement buyerci=driver.findElement(By.xpath("//input[@id='city']"));
		buyerci.sendKeys(ciname);
	}
	public void buyercredit(String cdname) {
		WebElement buyercd=driver.findElement(By.xpath("//input[@id='card']"));
		buyercd.sendKeys(cdname);
	}
	public void buyermnth(String mname) {
		WebElement buyermn=driver.findElement(By.xpath("//input[@id='month']"));
		buyermn.sendKeys(mname);
	}
	public void buyeryear(String yrname) {
		WebElement buyeryr=driver.findElement(By.xpath("//input[@id='year']"));
		buyeryr.sendKeys(yrname);
	}
	public void buyerclick() {
		WebElement buyerclk=driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']"));
		buyerclk.click();
	}
	public WebElement check() {
		WebElement checks=driver.findElement(By.xpath("//div[@class='sa-placeholder']"));
		return checks;
	}
	
}
