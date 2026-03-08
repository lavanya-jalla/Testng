package Tesntng;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngTest1 {
	@Test
	public void Test1() {
		System.out.println("This is my Testng Demo");
		Reporter.log("Testng test");
		Calculator c=new Calculator();
		Assert.assertEquals(c.add(10, 20),60);
	}

}
