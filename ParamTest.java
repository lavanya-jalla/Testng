package Tesntng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class ParamTest {
	@Test
	@Parameters("Username")
	public void login(String u) {
		System.out.println(u);
	}

}
