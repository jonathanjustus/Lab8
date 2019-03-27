import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class BoardGame{
	
	//Unique pieces and location
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	//Constructor with pieces and location
	public BoardGame(){
		
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
		
	}

	//addPlayer to board
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation){
		
		if (playerPieces.containsValue(gamePiece))
		{
			return false;
		}
		
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		
		return true;	
	}
	
	//Get players game piece
	public GamePiece getPlayerGamePiece(String playerName){
		
		GamePiece piece = playerPieces.get(playerName);
		return piece;
	}
	
	//Get player from game piece
	public String getPlayerWithGamePiece(GamePiece gamePiece){
		
		for (Map.Entry<String, GamePiece> entry : playerPieces.entrySet()){
			
			if (gamePiece.equals(entry.getValue())){
				
				return entry.getKey();
			}
		}
		return null;
	}
	
	//move player on board
	public void movePlayer(String playerName, Location newLocation){
		
		playerLocations.replace(playerName, newLocation);
	}
	
	//Two players move at same times case
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations){
		
		String playerAName = playerNames[0];
		String playerBName = playerNames[1];
		
		Location aLocation = newLocations[0];
		Location bLocation = newLocations[1];

		GamePiece playerA = playerPieces.get(playerAName);
		GamePiece playerB = playerPieces.get(playerBName);
		
		GamePiece priorityPiece = GamePiece.movesFirst(playerA, playerB);
		
		
		String[] playerOrder = new String[2];
		
		if (priorityPiece.equals(playerA)){
			
			movePlayer(playerAName, aLocation);
			movePlayer(playerBName, bLocation);
			playerOrder[0] = playerAName;
			playerOrder[1] = playerBName;
		}
		
		else{
			movePlayer(playerBName, bLocation);
			movePlayer(playerAName, aLocation);
			playerOrder[0] = playerBName;
			playerOrder[1] = playerAName;
		}
		return playerOrder;
	}	
	
	//Get player location
	public Location getPlayersLocation(String player){
		
		Location location = playerLocations.get(player);
		return location;
	}
	
	//get the players at a certain location
	public ArrayList<String> getPlayersAtLocation(Location loc){
		
		ArrayList<String> playersAtLocation = new ArrayList<String>();

		for (Map.Entry<String, Location> entry: playerLocations.entrySet()){
			
			if (entry.getValue().equals(loc)){
				
				playersAtLocation.add(entry.getKey());
			}
		}
		return playersAtLocation;
	}
	
	//Get all game pieces at a location
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
		
		ArrayList<GamePiece> piecesAtLocation = new ArrayList<GamePiece>();
		ArrayList<String> playersAtLocation = getPlayersAtLocation(loc);
		
		for (int i = 0; i < playersAtLocation.size(); ++i) {
			
			piecesAtLocation.add(playerPieces.get(playersAtLocation.get(i)));
		}
		
		return piecesAtLocation;
	}
	
	//All players in game
	public Set<String> getPlayers(){
		
		return playerPieces.keySet();
	}
	
	//get player location
	public Set<Location> getPlayerLocations(){
		
		Set<Location> playerLocationSet = new HashSet<Location>();
		
		for (Map.Entry<String, Location> entry: playerLocations.entrySet()){
			
			playerLocationSet.add(entry.getValue());
		}
		return playerLocationSet;
	}
	
	//Player player peices
	public Set<GamePiece> getPlayerPieces(){
		
		Set<GamePiece> playerPiecesSet = new HashSet<GamePiece>();
		
		for (Map.Entry<String, GamePiece> entry : playerPieces.entrySet()){
			
			playerPiecesSet.add(entry.getValue());
		}
		return playerPiecesSet;
	}
}