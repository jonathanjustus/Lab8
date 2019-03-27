 /**  	
  * Enum to represent the game pieces available in a board game. Each game piece has a color and a shape (represented by a GamePieceAppearance object) 	
  * and move priority (the piece with the lowest priority value gets to move first, turns are taken in priority value order (increasing)). Each constant 	
  * represents a game piece that a player might choose to use in the board game. 	
  *   	
  * @author johny 	
  * 	
  * @version 2019-03-25	
  * 	
  */
public enum GamePiece
{
	
	//Constants for pieces available
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8), 
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1), 
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 7),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10) ;
	
	/**
	  * Instance Variables 	
	  */
	private GamePieceAppearance appearance;
	private int priority;
	
	  /**
	    * Constructor	
	    * @param appearance The shape and color of the game piece 	
	    * @param priority The priority of the game piece. 	
	    */
	private GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	
	 /**	
	   * getColor	
	   * Gets the color of the game piece.	
	   */
	public Color getColor()
	{
		
		Color pieceColor = appearance.getColor();
		return pieceColor;
	}
	
	/**
	  * getShape	
	  * Gets the shape of the game piece. 	
	  */
	public Shape getShape()
	{
		
		Shape pieceShape = appearance.getShape();
		return pieceShape;
	}
	
	/**	
	  * movesFirst
	  * Given two game pieces, determines which one takes its turn first.
	  */
	public static GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		
		if (a.priority < b.priority){
			
			return a;
		}
		else{
			return b;
		}
	}
	
	/** 	
     * toString
     * Gets information about the game piece.
     */
	public String toString()
	{
		return String.format("%s: a %s %s with priority %d", name(), String.valueOf(getColor()).toLowerCase(), getShape(), priority);
	}
}