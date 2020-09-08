package Interview.Quations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertclass {
// it will excecute but it is failed it wont throw any exception it will throw java.lang.AssertionError
	@Test
	public void testSoft1() {
		
		SoftAssert sa = new SoftAssert();
		System.out.println("Test 1 is started");
		sa.assertEquals(12, 13);
		System.out.println("Test 1 is Completed");
		sa.assertAll();
		
	}

	@Test
	public void test4() {
		String str = "Saikirann";
		System.out.println("Test 4 is Started");
		Assert.assertTrue(str.contains("sai"));
		System.out.println("Test 4 is completed");
		Assert.assertEquals(11,23);
		System.out.println("Test 4edasis completed");
	}
	
	
	
	// in this expected and actual is same so it will exicute automatically it is hard assert 
	@Test

	 public void test2() {
	System.out.println("Test 2 is started");
			Assert.assertEquals("Sai", "Sai","Doesnot match elements");
			System.out.println("Test 2 is completed");
		
		 }
	
	// in this hard assert expected and actual is diffrent so it is not printing in console  
	
	@Test
	public void test3() {
		String str = "Saikiran";
		System.out.println("Test 3 is Started");
		Assert.assertTrue(str.contains("sai"));
		System.out.println("Test 3 is completed");
	}

	
	
	
	
	
	
	
}
