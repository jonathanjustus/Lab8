import org.junit.Assert;
import org.junit.Test;

/** 	
 * Class that tests the Location class. 	
 *   	
 * @author johny	
 *   	
 * @version 2019-03-25  	
 *	
 */
public class LocationTest
{
	
	  /**
	    * Tests the locations' enum values.
	    */	
	    @Test
	public void locationEnumTest()
	    {
		
		Assert.assertEquals("Location enum value incorrect.", Location.KITCHEN, Location.valueOf("KITCHEN"));
		Assert.assertEquals("Location enum value incorrect.", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
		Assert.assertEquals("Location enum value incorrect.", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
		Assert.assertEquals("Location enum value incorrect.", Location.BALLROOM, Location.valueOf("BALLROOM"));
		Assert.assertEquals("Location enum value incorrect.", Location.STUDY, Location.valueOf("STUDY"));
		Assert.assertEquals("Location enum value incorrect.", Location.HALL, Location.valueOf("HALL"));
		Assert.assertEquals("Location enum value incorrect.", Location.LOUNGE, Location.valueOf("LOUNGE"));
		Assert.assertEquals("Location enum value incorrect.", Location.LIBRARY, Location.valueOf("LIBRARY"));
		Assert.assertEquals("Location enum value incorrect.", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
	}
}