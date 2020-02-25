package com.icici.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
	
	public static WebDriver driver;

	public Page() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver","C:\\Jyotsana_Selenium\\Kimmi_Workspace\\BankingPomBasics1\\src\\test\\resources\\executables\\chromedriver.exe");
            driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://zoho.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.quit();
            
		}
		
		

	}

}
