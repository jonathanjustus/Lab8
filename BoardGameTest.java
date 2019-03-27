import java.util.ArrayList;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest
{
	/**
	 * Tests the addPlayer method.
	 */
	@Test
	public void addPlayerTest()
	{
		BoardGame game = new BoardGame();
		
		Boolean actual = game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		Boolean expected = true;
		Assert.assertEquals("Failed to add the player.", expected, actual);
		
		Boolean actual2 = game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		Boolean expected2 = false;
		Assert.assertEquals("Added a duplicate player.", expected2, actual2);
	}
	
	/**
	 * Tests getPlayerGamePiece
	 */
	@Test
	public void getPlayerGamePieceTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		GamePiece actual = game.getPlayerGamePiece("Jim");
		GamePiece expected = GamePiece.RED_RACER;
		
		Assert.assertEquals("Failed to get correct game piece.", expected, actual);
	}
	
	/**
	 * Tests getPlayerWithGamePiece.
	 */
	@Test
	public void getPlayerWithGamePieceTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		String actual = game.getPlayerWithGamePiece(GamePiece.RED_RACER);
		String expected = "Jim";
		String actual2 = game.getPlayerWithGamePiece(GamePiece.BLUE_BOOT);
		String expected2 = "Dan";
		
		Assert.assertEquals("Failed to get correct player.", expected, actual);
		Assert.assertEquals("Failed to get correct player.", expected2, actual2);
	}
	
	/**
	 * Test movePlayer
	 */
	@Test
	public void movePlayerTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		game.movePlayer("Jim", Location.LIBRARY);
		
		Assert.assertEquals("Failed to move player.", game.getPlayersLocation("Jim"), Location.LIBRARY);
	}
	
	/**
	 * Tests moveTwoPlayers.
	 */
	@Test
	public void moveTwoPlayersTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		game.moveTwoPlayers(playerNames, newLocations);
		
		Assert.assertEquals("Failed to move first player.", game.getPlayersLocation("Jim"), Location.LIBRARY);
		Assert.assertEquals("Failed to move second player.", game.getPlayersLocation("Dan"), Location.HALL);
		
		BoardGame game2 = new BoardGame();
		String[] playerNames2 = new String[2];
		Location[] newLocations2 = new Location[2];
		
		game2.addPlayer("Jim", GamePiece.BLUE_BOOT, Location.KITCHEN);
		game2.addPlayer("Dan", GamePiece.RED_RACER, Location.BILLIARD_ROOM);
		
		playerNames2[0] = "Jim";
		playerNames2[1] = "Dan";
		newLocations2[0] = Location.LIBRARY;
		newLocations2[1] = Location.HALL;
		
		game2.moveTwoPlayers(playerNames2, newLocations2);
		
		Assert.assertEquals("Failed to move first player.", game2.getPlayersLocation("Jim"), Location.LIBRARY);
		Assert.assertEquals("Failed to move second player.", game2.getPlayersLocation("Dan"), Location.HALL);
	}
	
	/**
	 * Tests getPlayersLocation.
	 */
	@Test
	public void getPlayersLocationTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		game.movePlayer("Jim", Location.LIBRARY);
		
		Assert.assertEquals("Failed to get correct location of player.", game.getPlayersLocation("Jim"), Location.LIBRARY);
	}
	
	/**
	 * Tests getPlayersAtLocation.
	 */
	@Test
	public void getPlayersAtLocationTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		game.movePlayer("Jim", Location.LIBRARY);
		
		ArrayList<String> allPlayersAtLoc = game.getPlayersAtLocation(Location.LIBRARY);
		String actual = allPlayersAtLoc.get(0);
		String expected = "Jim";
		
		Assert.assertEquals("Failed to get players at location.", expected, actual);
	}
	
	/**
	 * Tests getGamePiecesAtLocation.
	 */
	@Test
	public void getGamePiecesAtLocationTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		game.movePlayer("Jim", Location.LIBRARY);
		
		ArrayList<GamePiece> allGamePiecesAtLoc = game.getGamePiecesAtLocation(Location.LIBRARY);
		GamePiece actual = allGamePiecesAtLoc.get(0);
		GamePiece expected = GamePiece.RED_RACER;
		
		Assert.assertEquals("Failed to get game pieces at location.", expected, actual);
	}
	
	/**
	 * Tests getPlayers.
	 */
	@Test
	public void getPlayersTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		Set<String> allPlayers = game.getPlayers();
		Boolean actual = allPlayers.contains("Jim");
		Boolean expected = true;
		Boolean actual2 = allPlayers.contains("Dan");
		Boolean expected2 = true;
		
		Assert.assertEquals("Failed to get players' names.", expected, actual);
		Assert.assertEquals("Failed to get players' names.", expected2, actual2);
	}
	
	/**
	 * Tests getPlayerLocations.
	 */
	@Test
	public void getPlayerLocationsTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		Set<Location> allPlayersLocs = game.getPlayerLocations();
		Boolean actual = allPlayersLocs.contains(Location.KITCHEN);
		Boolean expected = true;
		Boolean actual2 = allPlayersLocs.contains(Location.BILLIARD_ROOM);
		Boolean expected2 = true;
		
		Assert.assertEquals("Failed to get players' locations.", expected, actual);
		Assert.assertEquals("Failed to get players' locations.", expected2, actual2);
	}
	
	/**
	 * Tests getPlayerPieces.
	 */
	@Test
	public void getPlayerPiecesTest()
	{
		
		BoardGame game = new BoardGame();
		String[] playerNames = new String[2];
		Location[] newLocations = new Location[2];
		
		game.addPlayer("Jim", GamePiece.RED_RACER, Location.KITCHEN);
		game.addPlayer("Dan", GamePiece.BLUE_BOOT, Location.BILLIARD_ROOM);
		
		playerNames[0] = "Jim";
		playerNames[1] = "Dan";
		newLocations[0] = Location.LIBRARY;
		newLocations[1] = Location.HALL;
		
		Set<GamePiece> allPlayersPieces = game.getPlayerPieces();
		Boolean actual = allPlayersPieces.contains(GamePiece.RED_RACER);
		Boolean expected = true;
		Boolean actual2 = allPlayersPieces.contains(GamePiece.BLUE_BOOT);
		Boolean expected2 = true;
		
		Assert.assertEquals("Failed to get players' pieces.", expected, actual);
		Assert.assertEquals("Failed to get players' pieces.", expected2, actual2);
	}
	

}
