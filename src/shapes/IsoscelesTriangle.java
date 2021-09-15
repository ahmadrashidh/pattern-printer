/**
 * 
 */
package shapes;

/**
 * @author ACER
 *
 */
public class IsoscelesTriangle extends Triangle {

	protected String draw() {

		StringBuilder pattern = new StringBuilder();

		// iterating over each line
		for (int row = 1; row <= this.getHeight(); row++) {

			// printing spaces before star
			for (int space = this.getHeight(); space >= row; space--) {
				pattern.append(" ");
			}

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
