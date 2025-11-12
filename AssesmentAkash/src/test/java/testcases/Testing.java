package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pages.AutomationConstant;
import pages.Cart;
import pages.LoginPage;
import utility.ExcelUtility;

public class Testing extends Base{
	
	LoginPage obj;
	Cart pbg;
	@BeforeClass
	public void login() {
		obj=new LoginPage(driver);
		pbg=new Cart(driver);
	}
	@Test
	public void tc001() throws InterruptedException, IOException {
		obj.bfrlogin();
		obj.setUname("12akash");
//		obj.setUname(ExcelUtility.readExcel(0, 0));
		obj.setPass("22akash21");
//		obj.setPass(ExcelUtility.readExcel(0, 1));
		obj.setLoginButton();
		Thread.sleep(2000);
//		WebElement db=obj.verifylogin();
//		db.isDisplayed();
//		Assert.assertEquals(db, AutomationConstant.vrf());
		obj.lapclk();
		obj.addcart();
	}
	@Test
	public void tc002() {
		pbg.cartPage();
		pbg.placeOrder();
		pbg.buyername("Akash");
		pbg.buyercount("india");
		pbg.buyercity("Kollam");
		pbg.buyercredit("12es23223sss");
		pbg.buyermnth("12");
		pbg.buyeryear("2025");
		pbg.buyerclick();
		WebElement chk=pbg.check();
		chk.isDisplayed();
	}

}
