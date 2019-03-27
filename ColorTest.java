import org.junit.Assert;
import org.junit.Test;

/**  	
 * Class that tests the Color class.  	
 *  	
 * @author johny 	
 * 	
 * @version 2019-03-25 	
 * 	
 */
public class ColorTest
{
	
	 /**	  	
	   * Tests  colors' enum values, rgb values, and get methods. 	
	   */  	
	     @Test
	public void colorTest()
	     {
	
		Color color = Color.RED;
		Assert.assertEquals("Incorrect R in RGB color for red.", color.getR(), 255);
		Assert.assertEquals("Incorrect G in RGB color for red.", color.getG(), 0);
		Assert.assertEquals("Incorrect B in RGB color for red.", color.getB(), 0);
		
		Color color2 = Color.BLUE;
		Assert.assertEquals("Incorrect R in RGB color for blue.", color2.getR(), 0);
		Assert.assertEquals("Incorrect R in RGB color for blue.", color2.getG(), 0);
		Assert.assertEquals("Incorrect R in RGB color for blue.", color2.getB(), 255);
		
		Color color3 = Color.GREEN;
		Assert.assertEquals("Incorrect R in RGB color for green.", color3.getR(), 0);
		Assert.assertEquals("Incorrect R in RGB color for green.", color3.getG(), 255);
		Assert.assertEquals("Incorrect R in RGB color for green.", color3.getB(), 0);
		
		Color color4 = Color.YELLOW;
		Assert.assertEquals("Incorrect R in RGB color for yellow.", color4.getR(), 255);
		Assert.assertEquals("Incorrect R in RGB color for yellow.", color4.getG(), 255);
		Assert.assertEquals("Incorrect R in RGB color for yellow.", color4.getB(), 0);
		
		Color color5 = Color.MAGENTA;
		Assert.assertEquals("Incorrect R in RGB color for magenta.", color5.getR(), 255);
		Assert.assertEquals("Incorrect R in RGB color for magenta.", color5.getG(), 0);
		Assert.assertEquals("Incorrect R in RGB color for magenta.", color5.getB(), 255);
		
		Color color6 = Color.CYAN;
		Assert.assertEquals("Incorrect R in RGB color for cyan.", color6.getR(), 0);
		Assert.assertEquals("Incorrect R in RGB color for cyan.", color6.getG(), 255);
		Assert.assertEquals("Incorrect R in RGB color for cyan.", color6.getB(), 255);
		
		Assert.assertEquals("Color enum value incorrect.", Color.RED, Color.valueOf("RED"));
		Assert.assertEquals("Color enum value incorrect.", Color.GREEN, Color.valueOf("GREEN"));
		Assert.assertEquals("Color enum value incorrect.", Color.BLUE, Color.valueOf("BLUE"));
		Assert.assertEquals("Color enum value incorrect.", Color.YELLOW, Color.valueOf("YELLOW"));
		Assert.assertEquals("Color enum value incorrect.", Color.CYAN, Color.valueOf("CYAN"));
		Assert.assertEquals("Color enum value incorrect.", Color.MAGENTA, Color.valueOf("MAGENTA"));
	}
}