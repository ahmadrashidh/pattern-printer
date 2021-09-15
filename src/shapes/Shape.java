/**
 * 
 */
package shapes;

import java.util.Scanner;

/**
 * @author ACER
 *
 */
public abstract class Shape {

	protected int height;
	protected int width;

	void setHeight(int height) {
		if (height <= 0) {
			throw new IllegalArgumentException(
					"ShapesInvalidInputException: Dimensions must be greater than zero, not " + height);
		}
		this.height = height;
	}

	void setWidth(int width) {
		if (width <= 0) {
			throw new IllegalArgumentException(
					"ShapesInvalidInputException: Dimensions must be greater than zero, not " + width);
		}
		this.width = width;
	}

	int getHeight() {
		return this.height;
	}

	int getWidth() {
		return this.width;
	}

	protected boolean isValidDimension(int dimension) {

		boolean isValid;

		isValid = dimension > 0;

		return isValid;

	}

	protected int readDimension(String dimensionName) {
		
		int counter = 3;
		int dimension = 0;

		Scanner scan = ConsoleIO.getScanner();

		dimension = scan.nextInt();
		while (dimension < 0 && counter > 1) {
			counter--;
			System.out.println(dimensionName + " must be positive integer. Re-enter " + dimensionName + " (You have "
					+ counter + " chances )");
			dimension = scan.nextInt();
		}

		if (isValidDimension(dimension)) {
			return dimension;
		} else {
			System.out.println("Exhausted chances. Program Exits");
			System.exit(0);
			return dimension;
		}

	}

	void getDimensionFromUser() {

		System.out.println("Enter the height of the " + this.getClass().getSimpleName());
		this.setHeight(readDimension("Height"));

		System.out.println("Enter the width of the " + this.getClass().getSimpleName());
		this.setWidth(readDimension("Width"));

	}

	protected abstract String draw();

}
