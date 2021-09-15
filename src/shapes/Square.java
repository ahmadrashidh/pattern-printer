package shapes;

public class Square extends Rectangle {

	void setSide(int side) {
		super.setHeight(side);
		super.setWidth(side);
	}

	int getSide() {
		return this.getHeight();
	}

	protected void promptUserForInput() {
		int side = 0;
		
		System.out.println("Enter the side of the " + this.getClass().getSimpleName() + "\n");
		side = readDimension("Side");
		
		this.setSide(side);

	}
}
