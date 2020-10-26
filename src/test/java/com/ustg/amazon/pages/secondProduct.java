package com.ustg.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class secondProduct {
	
	
	@FindBy(id="add-to-cart-button")
	private WebElement addbtn;
	@FindBy(id="hlb-view-cart")
	private WebElement cartbtn;
	
	
	static WebDriver driver;
	public secondProduct(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAddToCart() {
		addbtn.click();
		}
	public void clickCart() {
		cartbtn.click();
		}

}
