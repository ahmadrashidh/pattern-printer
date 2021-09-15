package shapes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class IsosTriangleWithoutErrorTest {
	
	static IsoscelesTriangleWithoutErrorHandling triangle = new IsoscelesTriangleWithoutErrorHandling();;

	
	@Test 
	public void positiveValue_returns_true(){
		
		int dimension = 2;
		assertTrue(triangle.isValidDimension(dimension));
		
	}
	
	@Test
	public void negativeValue_returns_false() {
		int dimension = -2;
		assertFalse(triangle.isValidDimension(dimension));
	}


	@Test
	public void positiveHeight_returns_correctPattern() throws Exception {
		int height = 3;

		String correctPattern = new String("   * \n  * * \n * * * \n");
		triangle.setHeight(height);

		assertEquals(correctPattern, triangle.draw());

	}

	@Test
	public void negHeight_printsNothing() throws Exception {
		int height = -2;

		String correctPattern = new String("");
		triangle.setHeight(height);

		assertEquals(correctPattern, triangle.draw());

	}
	

}
