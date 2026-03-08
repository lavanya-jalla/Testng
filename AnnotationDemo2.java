package Tesntng;


import org.testng.annotations.Test;

public class AnnotationDemo2 {
	@Test(priority = 2,dependsOnMethods = {"login"},invocationCount=3,groups={"smoke"})
	public void composeMail() {
		System.out.println("This is compose mail");
	}
	@Test(priority = 3,dependsOnMethods = {"login"})
	public void deleteMail() {
		System.out.println("This is Delete Mail");

	}
	@Test(priority = 1,description = "Login Test")
	public void login() {
//		Assert.assertTrue(10>20);
	System.out.println("This is login setup");
	
	}
	@Test(priority = 4,enabled=false)
	public void logout() {
		
	System.out.println("This is logout setup");
	}
	@Test(priority = -1)
	public void openApp() {
	System.out.println("Opening the application");
	}@Test(priority = 5)
		public void closeApp() {
		System.out.println("Closing the application");

	}
		@Test(priority = 5,timeOut=4)
		public void otherTest() throws InterruptedException{
	System.out.println("Closing the application");
	Thread.sleep(5000);
	}



}
