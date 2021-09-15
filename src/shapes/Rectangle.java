package shapes;

public class Rectangle extends Shape {

	protected String draw() {
		StringBuilder pattern = new StringBuilder();
		
		for (int row = 1; row <= this.getHeight(); row++) {
			
			for (int stars = 1; stars <= this.getWidth(); stars++) {
				pattern.append("* ");
				
			}
			
			pattern.append("\n");
		}

		return pattern.toString();

	}

}
