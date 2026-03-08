package Tesntng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@Test(groups={"smoke"})
	public void composeMail() {
		System.out.println("This is compose mail");
	}
	@Test
	public void deleteMail() {
		System.out.println("This is Delete Mail");

	}
	@BeforeMethod
	public void login() {
		
	System.out.println("This is login setup");
	}
	@AfterMethod
	public void logout() {
	System.out.println("This is logout setup");
	}
	@BeforeClass
	public void openApp() {
	System.out.println("Opening the application");
	}
	@AfterClass
	public void closeApp() {
	System.out.println("Closing the application");
	}
	@BeforeSuite
	public void openDb() {
		System.out.println("open the db connection");
		}
	@AfterSuite
	public void closeDb() {
		System.out.println("Closing the db connection");
		}
}
