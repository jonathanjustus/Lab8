import org.junit.Assert;
import org.junit.Test;

/**
 * Class that tests the GamePieceAppearance class.	
 *  	
 * @author johny  	
 *   	
 * @version 2019-03-25	  	
 */ 
public class GamePieceAppearanceTest
{
	
	/**	
	  * Tests getColor
	  */
	  @Test
	public void getColorTest()
	  {
		
		GamePieceAppearance appearance = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		
		Color actual = appearance.getColor();
		Color expected = Color.RED;
		
		Assert.assertEquals("Failed to get correct color.", expected, actual);
	}
	
	  /**
	    * Tests getShape. 	
	    */
	public void getShapeTest()
	{
		
		GamePieceAppearance appearance = new GamePieceAppearance(Color.RED, Shape.RACECAR);
		
		Shape actual = appearance.getShape();
		Shape expected = Shape.RACECAR;
		
		Assert.assertEquals("Failed to get correct shape.", expected, actual);
	}
}