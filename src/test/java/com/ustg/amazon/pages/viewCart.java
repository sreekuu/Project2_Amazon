package com.ustg.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class viewCart {
	
	WebDriver driver;
	@FindBy(id="nav-cart-count")
	private WebElement cart;
	
	public viewCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickViewCart() {
		cart.click();
	}

}
