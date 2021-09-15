package shapes;

public class IsoscelesTriangleWithoutErrorHandling extends TriangleWithoutErrorHandling {

	protected String draw() {

		StringBuilder pattern = new StringBuilder();
		// going over lines
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
