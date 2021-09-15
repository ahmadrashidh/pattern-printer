package shapes;

public class ShapeFactory {

	Shape getShape(int choice) {

		switch (choice) {

		case 1:

			return new Rectangle();

		case 2:

			return new Square();
		
		case 4:
			
			return new Paralellogram();

		default:

			return null;

		}
	}
	
	Shape getTriangle(int choice) {
		
		switch(choice) {
		
		case 1:
			
			return new IsoscelesTriangle();
			
		case 2:
			
			return new RightAngledTriangle();
			
		default:
			
			return null;
		
		}
		
	}
	


}
