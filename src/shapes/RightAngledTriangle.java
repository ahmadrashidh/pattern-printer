/**
 * 
 */
package shapes;

/**
 * @author ACER
 *
 */
public class RightAngledTriangle extends Triangle {

	protected String draw() {

		StringBuilder pattern = new StringBuilder();

		// iterating thru lines
		for (int row = 1; row <= this.getHeight(); row++) {

			// printing stars for triangle
			for (int star = 1; star <= row; star++) {
				pattern.append("* ");
			}

			// next line
			pattern.append("\n");
		}

		return pattern.toString();
	}

}
