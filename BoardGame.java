import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BoardGame
{
	/**
	 * Protected Variables
	 */
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	/**
	 * Constructor
	 */
	public BoardGame()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
		
	}

	/**
	 * addPlayer
	 * Adds a player to the board game object.
	 * @param String playerName
	 * @param GamePiece gamepiece
	 * @param Location initialLocation
	 */
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		if (playerPieces.containsValue(gamePiece))
		{
			return false;
		}
		
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		
		return true;	
	}
	
	/**
	 * getPlayerGamePiece
	 * Given a location, find the game pieces associated with all the players at that location.
	 * @param String playerName
	 */
	public GamePiece getPlayerGamePiece(String playerName)
	{
		GamePiece piece = playerPieces.get(playerName);
		return piece;
	}
	
	/**
	 * getPlayerwithGamePiece
	 * Given a game piece, find the player associated with that game piece.
	 * @param GamePiece gamePiece
	 */
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		//String player = playerPieces.getKey(gamePiece);
		for (Map.Entry<String, GamePiece> entry : playerPieces.entrySet())
		{
			if (gamePiece.equals(entry.getValue()))
			{
				return entry.getKey();
			}
		}
		return null;
	}
	
	/**
	 * movePlayer
	 * Moves a player to a new location in the board game.
	 * @param String playerName
	 * @param Location newLocation
	 */
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.replace(playerName, newLocation);
	}
	
	/**
	 * moveTwoPlayers
	 * Method to use when Two players each want to move at the same time.
	 * @param String[] playerNames
	 * @param Location[] newLocations
	 */
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		String playerAName = playerNames[0];
		String playerBName = playerNames[1];
		
		Location aLocation = newLocations[0];
		Location bLocation = newLocations[1];

		GamePiece playerA = playerPieces.get(playerAName);
		GamePiece playerB = playerPieces.get(playerBName);
		
		GamePiece priorityPiece = GamePiece.movesFirst(playerA, playerB);
		
		
		String[] playerOrder = new String[2];
		
		if (priorityPiece.equals(playerA))
		{
			movePlayer(playerAName, aLocation);
			movePlayer(playerBName, bLocation);
			playerOrder[0] = playerAName;
			playerOrder[1] = playerBName;
		}
		
		else
		{
			movePlayer(playerBName, bLocation);
			movePlayer(playerAName, aLocation);
			playerOrder[0] = playerBName;
			playerOrder[1] = playerAName;
		}
		
		return playerOrder;
	}	
	
	/**
	 * getPlayersLocation
	 * Gets the location of a player.
	 * @param String player
	 */
	public Location getPlayersLocation(String player)
	{
		Location location = playerLocations.get(player);
		return location;
	}
	
	/**
	 * getPlayersAtLocation
	 * Given a location, find all players at that location.
	 * @param Location loc
	 */
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> playersAtLocation = new ArrayList<String>();

		for (Map.Entry<String, Location> entry: playerLocations.entrySet())
		{
			if (entry.getValue().equals(loc))
			{
				playersAtLocation.add(entry.getKey());
			}
		}
		
		return playersAtLocation;
	}
	
	/**
	 * getGamePiecesAtLocation
	 * Given a location, find the game pieces associated with all the players at that location.
	 * @param Location loc
	 */
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> piecesAtLocation = new ArrayList<GamePiece>();
		ArrayList<String> playersAtLocation = getPlayersAtLocation(loc);
		
		for (int i = 0; i < playersAtLocation.size(); ++i) {
			
			piecesAtLocation.add(playerPieces.get(playersAtLocation.get(i)));
		}
		
		return piecesAtLocation;
	}
	
	/**
	 * getPlayers
	 * Gets all players recorded in the game.
	 */
	public Set<String> getPlayers()
	{
		return playerPieces.keySet();
	}
	
	/**
	 * getPlayerLocations
	 * Gets all locations that the players are at (not all possible locations).
	 */
	public Set<Location> getPlayerLocations()
	{
		Set<Location> playerLocationSet = new HashSet<Location>();
		
		for (Map.Entry<String, Location> entry: playerLocations.entrySet())
		{
			playerLocationSet.add(entry.getValue());
		}
		
		return playerLocationSet;
	}
	
	/**
	 * getPlayerPieces
	 * Gets all game pieces associated with the players (not all possible game pieces).
	 */
	public Set<GamePiece> getPlayerPieces()
	{
		
		Set<GamePiece> playerPiecesSet = new HashSet<GamePiece>();
		
		for (Map.Entry<String, GamePiece> entry : playerPieces.entrySet())
		{
			playerPiecesSet.add(entry.getValue());
		}
		
		return playerPiecesSet;
		
	}


}
