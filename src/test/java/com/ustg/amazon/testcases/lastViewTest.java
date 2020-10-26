package com.ustg.amazon.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ustg.amazon.pages.lastSignIn;
import com.ustg.amazon.pages.secondCategory;
import com.ustg.amazon.pages.secondFilter;
import com.ustg.amazon.pages.secondProduct;
import com.ustg.amazon.pages.signOut;
import com.ustg.amazon.pages.viewCart;

public class lastViewTest extends initialSetUp {
	
	signOut signout;
	lastSignIn lastsignin;
	viewCart viewcart;
	String parent="";
	
  @Test
  public void finalCart() throws InterruptedException {
	  
	  signout = new signOut(driver);
	  signout = PageFactory.initElements(driver, signOut.class);
	  lastsignin = new lastSignIn(driver);
	  lastsignin = PageFactory.initElements(driver, lastSignIn.class);
	  viewcart = new viewCart(driver);
	  viewcart = PageFactory.initElements(driver, viewCart.class);
	  signout.clickMenu();
	  signout.clickSignOut();
	  Thread.sleep(5000);
	  lastsignin.enterUserName("lekshmipssree2015@gmail.com");
	  lastsignin.clickContinue();
	  Thread.sleep(5000);
	  lastsignin.enterPassword("rose@123");
	  lastsignin.clickLogin();
	  viewcart.clickViewCart();
	  Thread.sleep(5000);
	  
	  
  }
}
