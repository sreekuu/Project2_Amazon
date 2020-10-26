package com.ustg.amazon.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.ustg.amazon.pages.secondCategory;
import com.ustg.amazon.pages.secondFilter;
import com.ustg.amazon.pages.secondProduct;

public class secondCategoryTest extends initialSetUp {
	
	secondCategory secondcategory;
	secondFilter secondfilter;
	secondProduct secondproduct;
	String parent="";
	
	
  @Test
  public void secondAddToCart() throws InterruptedException {
	  
	  	 secondcategory = new secondCategory(driver);
	  	 secondcategory = PageFactory.initElements(driver, secondCategory.class);
	  	 secondfilter = new secondFilter(driver);
		 secondfilter = PageFactory.initElements(driver, secondFilter.class);
		 secondproduct = new secondProduct(driver);
		 secondproduct = PageFactory.initElements(driver, secondProduct.class);
		 secondcategory.clickMenu();
		  Thread.sleep(5000);
		  secondcategory.clickItemMenu();
		  Thread.sleep(5000);
		  secondcategory.clickItem();
		  Thread.sleep(5000);
		  secondfilter.clickPrice();
		  Thread.sleep(5000);
		  secondfilter.clickBatteryCapacity();
		  Thread.sleep(5000);
		  secondfilter.clickRating();
		  Thread.sleep(5000);
		  secondfilter.clickItem();
		  parent = driver.getWindowHandle();
			Set<String> ids = driver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			while (it.hasNext()){
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			secondproduct.clickAddToCart();
			  Thread.sleep(5000);
			secondproduct.clickCart();
			  Thread.sleep(5000);
  }
}
