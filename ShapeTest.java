import org.junit.Assert;

/**
 * Class that tests the Shape class.	
 *   	
 * @author johny	  	
 *   	
 * @version 2019-03-25	
 * 	
 */
public class ShapeTest
{
	
	/**
	  * Tests the shapes' enum values.
	  *
	  *@Test
	  **/
	public void shapeEnumTest()
	  {
		
		Assert.assertEquals("Shape enum value incorrect.", Shape.RACECAR, Shape.valueOf("RACECAR"));
		Assert.assertEquals("Shape enum value incorrect.", Shape.THIMBLE, Shape.valueOf("THIMBLE"));
		Assert.assertEquals("Shape enum value incorrect.", Shape.BOOT, Shape.valueOf("BOOT"));
	}
	
	//toString tester
	public void toStringTest()
	{
		
		Assert.assertEquals("Shape toString incorrect.", "thimble", Shape.THIMBLE.toString());
	}
}