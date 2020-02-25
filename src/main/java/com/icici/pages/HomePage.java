package com.icici.pages;
import org.openqa.selenium.By;

import com.icici.base.Page;


public class HomePage extends Page  {
 
	
	public LoginPage gotoLogin() {
		
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[4]")).click();
    
	return new LoginPage();		
		
	}

	
	public void gotoSupport() {
		
	}
	public void gotoSignup() {
		
	}
	public void gotoZohoedu() {
		
	}
	public void gotoLearnMore() {

} 
}


