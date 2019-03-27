/**	
  * Class to represent the appearance of a game piece. That is, the color and shape of a game piece.	
  *  	
  * @author johny 	
  *  	
  * @version 2019-03-25 	
  *	
  */
public class GamePieceAppearance
{
	
	 /**
	   * Instance Variables
	   */
	private Color color;
	private Shape shape;
	
	/**
	  * Constructor
	  * @param color The color of the game piece.
	  * @param shape The shape of the game piece.	
	  */
	public GamePieceAppearance(Color color, Shape shape)
	{
		
		this.color = color;
		this.shape = shape;
	}
	
	 /**
	   * GetColor()
	   * @return color of Color type
	   */
	public Color getColor()
	{
		
		return color;
	}
	
	/**
	  * GetShape()
	  * @return shape of Shape type
	  */
	public Shape getShape()
	{
		return shape;
	}
}