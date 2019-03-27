/**  	
  * Enum to represent a color (with rgb values). 	
  * 
  * @author johny	
  * 
  * @version 2019-03-25
  *	
  */
public enum Color
{
	
	RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), YELLOW(255, 255, 0),
	CYAN(0, 255, 255), MAGENTA(255, 0, 255);

	/** 	
     * Instance Variables
     */
	private int r;
	private int g;
	private int b;
	
	/**	
	  * Constructor 	
	  */
	private Color (int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	/**
	  * getR
	  * return int value of r
	  */
	public int getR()
	{
		return r;
	}
	
	/**
	  * getG	
	  * return int value of g	
	  */
	public int getG()
	{
		return g;
	}
	
	/**	
	  * getB
	  * return int value of b
	  */
	public int getB()
	{
		return b;
	}
}