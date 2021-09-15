/**
 * 
 */
package shapes;
/**
 * @author ACER
 *
 */
public abstract class Triangle extends Shape {

	protected void promptUserForInput() {

		int height = 0;
		// prompting input
		System.out.println("Enter the height of the " + this.getClass().getSimpleName() + "\n");

		height = readDimension("Height");
		this.setHeight(height);

	}
}
