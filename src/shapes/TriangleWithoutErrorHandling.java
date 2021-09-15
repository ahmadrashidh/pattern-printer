package shapes;

import java.util.Scanner;

public abstract class TriangleWithoutErrorHandling extends Shape {

	@Override
	void setHeight(int height) {
		this.height = height;
	}

	@Override
	int getHeight() {
		return this.height;
	}

	@Override
	void setWidth(int width) {
		this.width = width;
		
	}
	
	@Override
	int getWidth() {
		return this.width;
	}

	void readDimension() {

		// prompting input
		System.out.println("Enter the height of the " + this.getClass().getSimpleName() + "\n");

		// getting input
		Scanner scan = ConsoleIO.getScanner();

		this.setHeight(scan.nextInt());

	}

}
