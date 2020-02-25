package com.icici.rough;
import com.icici.pages.HomePage;
import com.icici.pages.LoginPage;
import com.icici.pages.ZohoAppPage;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//page objects design pattern/implementation
		HomePage page= new HomePage();
		LoginPage pg=page.gotoLogin();
		ZohoAppPage ap=pg.doSignIn();
		ap.gotoCreator();
		
		
		

	}

}
