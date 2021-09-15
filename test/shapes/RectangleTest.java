package shapes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class RectangleTest {

	static Rectangle rect;

	public RectangleTest() {

		rect = new Rectangle();

	}

	
	@Test 
	public void positiveValue_returns_true(){
		
		int dimension = 2;
		assertTrue(rect.isValidDimension(dimension));
		
	}
	
	@Test
	public void negativeValue_returns_false() {
		int dimension = -2;
		assertFalse(rect.isValidDimension(dimension));
	}
	
	@Test
	public void positiveHeight_returns_correctPattern() throws Exception {
		int height = 3;
		int width = 6;
		String correctPattern = new String("* * * * * * \n* * * * * * \n* * * * * * \n");
		rect.setHeight(height);
		rect.setWidth(width);
		assertEquals(correctPattern, rect.draw());

	}

	@Test
	public void negativeHeight_shouldThrow_illegalArgumentException() {
		int negHeight = -1;
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
			rect.setHeight(negHeight);

		});

		assertTrue(thrown.getMessage()
				.contains("ShapesInvalidInputException: Dimensions must be greater than zero, not " + negHeight));
	}

	@Test
	public void negativeWidth_shouldThrow_IllegalArgumentException() {
		int negWidth = -3;
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
			rect.setWidth(negWidth);

		});

		assertTrue(thrown.getMessage()
				.contains("ShapesInvalidInputException: Dimensions must be greater than zero, not " + negWidth));
	}

}
