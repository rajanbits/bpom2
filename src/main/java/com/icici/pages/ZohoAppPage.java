package com.icici.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.icici.base.Page;

public class ZohoAppPage extends Page{
	
	
	
	
	public void gotoCrm() {
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[7]/div/a/span")).click();
		
	}
	public void gotoMail() {
		driver.findElement(By.className("zl-app-title")).click();
	
	

}
	public void gotoCreator() {
		driver.findElement(By.className("zl-app-title")).click();
		
	}
	}
