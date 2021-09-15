/**
 * 
 */
package shapes;

/**
 * @author Ahmad
 *
 */

public class Paralellogram extends Shape {

	protected String draw() {

		StringBuilder pattern = new StringBuilder();

		for (int row = 1; row <= this.getHeight(); row++) {

			for (int space = 1; space <= row; space++) {
				pattern.append(" ");
			}

			for (int star = 1; star <= this.getWidth(); star++) {
				pattern.append("* ");
			}

			pattern.append("\n");

		}

		return pattern.toString();

	}

}
