import org.junit.Assert;
import org.junit.Test;

/**	
 * Class that tests the GamePiece class.  	
 *   	
 * @author johny  	
 *  	
 * @version 2019-03-25  	
 */
public class GamePieceTest
{
	
	//Test classes enumeration values
	public void gamePieceEnumTest()
	{
		
		Assert.assertEquals("Incorrect game piece color.", Color.RED, GamePiece.RED_RACER.getColor());
		Assert.assertEquals("Incorrect game piece shape.", Shape.RACECAR, GamePiece.RED_RACER.getShape());
		Assert.assertEquals("Incorrect game piece priority.", 0, 0);
		
		Assert.assertEquals("Incorrect game piece color.", Color.BLUE, GamePiece.BLUE_RACER.getColor());
		Assert.assertEquals("Incorrect game piece shape.", Shape.RACECAR, GamePiece.BLUE_RACER.getShape());
		Assert.assertEquals("Incorrect game piece priority.", 2, 2);
		
		Assert.assertEquals("Incorrect game piece color.", Color.MAGENTA, GamePiece.MAGENTA_RACER.getColor());
		Assert.assertEquals("Incorrect game piece shape.", Shape.RACECAR, GamePiece.MAGENTA_RACER.getShape());
		Assert.assertEquals("Incorrect game piece priority.", 1, 1);
		
		Assert.assertEquals("Incorrect game piece color.", Color.RED, GamePiece.RED_THIMBLE.getColor());
		Assert.assertEquals("Incorrect game piece shape.", Shape.THIMBLE, GamePiece.RED_THIMBLE.getShape());
		Assert.assertEquals("Incorrect game piece priority.", 10, 10);
		
		Assert.assertEquals("Incorrect game piece color.", Color.BLUE, GamePiece.BLUE_BOOT.getColor());
		Assert.assertEquals("Incorrect game piece shape.", Shape.BOOT, GamePiece.BLUE_BOOT.getShape());
		Assert.assertEquals("Incorrect game piece priority.", 5, 5);
		
		Assert.assertEquals("Incorrect game piece color.", Color.GREEN, GamePiece.GREEN_BOOT.getColor());
		Assert.assertEquals("Incorrect game piece shape.", Shape.BOOT, GamePiece.GREEN_BOOT.getShape());
		Assert.assertEquals("Incorrect game piece priority.", 8, 8);
		
		Assert.assertEquals("Incorrect game piece color.", Color.YELLOW, GamePiece.YELLOW_BOOT.getColor());
		Assert.assertEquals("Incorrect game piece shape.", Shape.BOOT, GamePiece.YELLOW_BOOT.getShape());
		Assert.assertEquals("Incorrect game piece priority.", 7, 7);
		
		Assert.assertEquals("GamePiece enum value incorrect.", GamePiece.RED_RACER, GamePiece.valueOf("RED_RACER"));
		Assert.assertEquals("GamePiece enum value incorrect.", GamePiece.GREEN_BOOT, GamePiece.valueOf("GREEN_BOOT"));
		Assert.assertEquals("GamePiece enum value incorrect.", GamePiece.BLUE_RACER, GamePiece.valueOf("BLUE_RACER"));
		Assert.assertEquals("GamePiece enum value incorrect.", GamePiece.YELLOW_BOOT, GamePiece.valueOf("YELLOW_BOOT"));
		Assert.assertEquals("GamePiece enum value incorrect.", GamePiece.MAGENTA_RACER, GamePiece.valueOf("MAGENTA_RACER"));
		Assert.assertEquals("GamePiece enum value incorrect.", GamePiece.RED_THIMBLE, GamePiece.valueOf("RED_THIMBLE"));
		Assert.assertEquals("GamePiece enum value incorrect.", GamePiece.BLUE_BOOT, GamePiece.valueOf("BLUE_BOOT"));
	}
	
	/**
	  * Tests getColor.
	  */
	  @Test
	public void getColorTest()
	  {
		
		Color actual = GamePiece.RED_RACER.getColor();
		Color expected = Color.RED;
		
		Assert.assertEquals("Failed to get correct color.", expected, actual);
	}
	
	  /**	
	    * Tests getShape.	
	    */
	    @Test
	public void getShapeTest()
	    {
		
		Shape actual = GamePiece.RED_RACER.getShape();
		Shape expected = Shape.RACECAR;
		
		Assert.assertEquals("Failed to get correct shape.", expected, actual);
	}
	
	    /**	
	      * Tests movesFirst. 	
	      */ 	
	      @Test
	public void movesFirstTest()
	      {
		
		GamePiece actual = GamePiece.movesFirst(GamePiece.RED_RACER, GamePiece.BLUE_BOOT);
		GamePiece expected = GamePiece.RED_RACER;
		
		Assert.assertEquals("Incorrect piece moved first.", expected, actual);
	}
	
	      /**	
	        * Tests toString.	
	        */
	public void toStringTest()
	{
		
		String actual = GamePiece.RED_RACER.toString();
		String expected = "RED_RACER: a red racecar with priority 0";
		
		Assert.assertEquals("Incorrect toString value.", expected, actual);
	}
}