package com.ustg.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class secondCategory {
	
	WebDriver driver;
	@FindBy(id="nav-hamburger-menu")
	private WebElement secondhamburger;
	@FindBy(xpath="//div[contains(text(),'Mobiles, Computers')]")
	private WebElement seconditemMenu;
	@FindBy(xpath="//a[contains(text(),'Power Banks')]")
	private WebElement seconditem;
	
	public secondCategory(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickMenu() {
	secondhamburger.click();
	}
	
	public void clickItemMenu() {
	seconditemMenu.click();
	}
	
	public void clickItem() {
	seconditem.click();
	}


}
