/**
 * 
 */
package shapes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author ACER
 *
 */
public class SquareTest {

	static Square square;

	public SquareTest() {
		square = new Square();
	}
	
	
	@Test 
	public void positiveValue_Returns_True(){
		
		int dimension = 2;
		assertTrue(square.isValidDimension(dimension));
		
	}
	
	@Test
	public void negativeValue_returns_false() {
		int dimension = -2;
		assertFalse(square.isValidDimension(dimension));
	}

	@Test
	public void positiveSide_returns_correctPattern() throws Exception {
		
		int side = 3;
		String correctPattern = new String("* * * \n* * * \n* * * \n");
		square.setSide(side);
		assertEquals(correctPattern, square.draw());

	}

	@Test
	public void negativeSide_shouldThrow_illegalArgumentException() {
		
		int negSide = -4;
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> square.setSide(negSide));

		assertTrue(thrown.getMessage()
				.contains("ShapesInvalidInputException: Dimensions must be greater than zero, not " + negSide));
	}

}
