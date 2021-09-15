/**
 * 
 */
package shapes;

/**
 * @author ACER
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		drawShapes();

	}

	public static void drawShapes() {

		int choice;
		boolean isPromptAgain = true;
		String promptShapeMenu = "Hello! Select the shape you want to print(by entering its serial number)? \n "
				+ "1. Rectangle \n 2. Square \n 3. Triangle \n 4. Paralellogram \n 9. Exit \n ";

		String promptTriangleMenu = "Choose the type of Triangle you would like to print? \n"
				+ " 1. Isosceles Triangle \n 2. Right Angled Triangle \n";

		
		ConsoleIO console = ConsoleIO.getInstance();
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = null;

		try {

			while (isPromptAgain) {

				choice = console.readChoiceFromUser(promptShapeMenu);

				switch (choice) {

				case 1:
				case 2:
				case 4:

					shape = shapeFactory.getShape(choice);

					break;

				case 3:

					choice = console.readChoiceFromUser(promptTriangleMenu);
					shape = shapeFactory.getTriangle(choice);

					break;

				case 9:

					console.print("Program Exits");
					System.exit(0);

				default:

				}

				if (shape == null) {

					console.print("Invalid Choice. Choose Again");

				} else {

					shape.getDimensionFromUser();
					console.print(shape.draw());

				}

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			console.closeScanner();
		}

	}

}
