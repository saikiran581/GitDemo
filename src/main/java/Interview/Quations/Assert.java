package Interview.Quations;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	@Test 
	public void Softassert() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Softassert is Started");
		sa.assertEquals(12, 13);
		System.out.println("Softassertion is completed");
		sa.assertAll();
	}
@Test
public void Hardassert() {
	System.out.println("Hardassert is Started");
	assertEquals(12, 13);
	System.out.println("Hardassertion is completed");
}

}
