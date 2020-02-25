package com.icici.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.icici.base.Page;


public class LoginPage extends Page{
	
	public  ZohoAppPage doSignIn() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("singhjyotsana199@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
		 driver.findElement(By.id("password")).sendKeys("Sana@123");
		 driver.findElement(By.id("nextbtn")).click();
		return new ZohoAppPage();
		 
	 }
	

}
