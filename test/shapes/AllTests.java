package shapes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ IsosTriangleTest.class, ParalellogramTest.class, RectangleTest.class, RightTriangleTest.class,
		SquareTest.class,IsosTriangleWithoutErrorTest.class })
public class AllTests {
	
}
