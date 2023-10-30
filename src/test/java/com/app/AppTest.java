package com.app;

import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest {

	@Test
//negative test case failure
  
	public void testlogin1() {
	App myapp= new App();
	Assert.assertEquals(0, myapp.userlogin("abc", "abc123"));
	}
	
	@Test
	public void testlogin2() {
		App myapp=new App();
		Assert.assertEquals(1, myapp.userlogin("abc", "123sk"));
	}

}
