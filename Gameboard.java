//arraylist<object> for brettet
//arraylist for spillere
import java.util.ArrayList;
import java.lang.Math;

public class Gameboard {
    ArrayList<Object> gameBoard = new ArrayList<>();
    ArrayList<String> gamePieces = new ArrayList<>();
    ArrayList<Player> players = new ArrayList<>();
    String[] chance = {};
    String[] communityChest = {};

    public Gameboard() {
        fillPieceArray();
    }

    public void fillPieceArray() {
        gamePieces.add("Dog");
        gamePieces.add("Hat");
        gamePieces.add("Iron");
        gamePieces.add("Car");
        gamePieces.add("Boot");
        gamePieces.add("Ship");
        gamePieces.add("Wheelbarrow");
        gamePieces.add("Thimble");
    }

    public void pickGamePiece(Player player) {
        int chosenInt = (int)(Math.random() * gamePieces.size());
        String chosenString = gamePieces.get(chosenInt);
        player.setGamePiece(chosenString);
        System.out.println("Your game piece is the " + chosenString);
        gamePieces.remove(chosenString);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }
}