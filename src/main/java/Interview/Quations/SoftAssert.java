package Interview.Quations;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SoftAssert {

	@Test
		 public void test1() {
		System.out.println("Test 1 Started ");
			Assert.assertEquals(12, 12,"Doesnot match elements");
		
		System.out.println("Test 1 is completed");
		 }
	@Test

	 public void test2() {
	System.out.println("Test 2 is started");
			Assert.assertEquals("Sai", "Sai","Doesnot match elements");
			System.out.println("Test 2 is completed");
		
		 }
	@Test
	public void test3() {
		String str = "Saikiran";
		Assert.assertTrue(str.contains("sai"));
		System.out.println("Test 3 is paased");
	}

	@Test 
	public void test4() {
		assertEquals("sai", "sai");
	}
	@Test
	public void test5() {
		SoftAssert sa = new SoftAssert();
		
		
	}
}


