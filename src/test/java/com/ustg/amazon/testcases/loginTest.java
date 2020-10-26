package com.ustg.amazon.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ustg.amazon.pages.Home;
import com.ustg.amazon.pages.Login;

public class loginTest extends initialSetUp {
	
	Login login;
	Home home;
	String parent="";
  @Test
  public void Login() throws InterruptedException {
	  login = new Login(driver);
	  login = PageFactory.initElements(driver, Login.class);
	  home = new Home(driver);
	  home = PageFactory.initElements(driver, Home.class);
	  login.clickSignIn();
	  Thread.sleep(5000);
	  login.enterUserName("lekshmipssree2015@gmail.com");
	  login.clickContinue();
	  Thread.sleep(5000);
	  login.enterPassword("rose@123");
	  login.clickLogin();
	  Thread.sleep(5000);

  }
  @Test(priority=1)
  public void selectItem()  throws InterruptedException {
	  home.clickMenu();
	  Thread.sleep(5000);
	  home.clickItemMenu();
	  Thread.sleep(5000);
	  home.clickItem();
	  Thread.sleep(5000);
	  
	
  }
}
