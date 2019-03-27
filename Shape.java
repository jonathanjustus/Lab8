 /** 	
  * Enum to represent the shape of a game piece.	
  *  	
  * @author johny  	
  * 	
  * @version 2019-03-25  	
  *  	
  */
public enum Shape
{
	
	THIMBLE, BOOT, RACECAR;

	Shape pieceShape;
	
	  /**
	    * Gives the name of the value of the enum object, in lowercase.
	    * 
	    * Overrides: toString in class java.lang.Enum<Shape>
	    * 
	    * @return The enum object's name in lowercase.
	    */ 	
	    @Override
	public String toString()
	    {
		
		return name().toLowerCase();
	}
}