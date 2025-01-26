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
        fillGameBoard();
    }

    public void fillGameBoard() {
        gameBoard.add("Start");
        gameBoard.add(new Place("Parkveien", 1200, Color.PURPLE));
        gameBoard.add("Community chest");
        gameBoard.add(new Place("Kirkeveien", 1200, Color.PURPLE));
        gameBoard.add("Income tax (pay 10% of your fortune or kr 4000)");
        gameBoard.add(new Place("Oslo S", 4000, Color.NONE));
        gameBoard.add(new Place("Kongens gate", 2000, Color.LIGHT_BLUE));
        gameBoard.add("Chance");
        gameBoard.add(new Place("Prinsens Gate", 2000, Color.LIGHT_BLUE));
        gameBoard.add(new Place("Øvre Slottsgate", 2400, Color.LIGHT_BLUE));
        gameBoard.add("Prison");
        gameBoard.add(new Place("Nedre Slottsgate", 2800, Color.PINK));
        gameBoard.add(new Place("Oslo Lysverker", 3000, Color.NONE));
        gameBoard.add(new Place("Trondheimsveien", 2800, Color.PINK));
        gameBoard.add(new Place("Nobels Gate", 3200, Color.PINK));
        gameBoard.add(new Place("Skøyen stasjon", 4000, Color.NONE));
        gameBoard.add(new Place("Grensen", 3600, Color.ORANGE));
        gameBoard.add("Commmunity chest");
        gameBoard.add(new Place("Gabels Gate", 3600, Color.ORANGE));
        gameBoard.add(new Place("Ringgata", 4000, Color.ORANGE));
        gameBoard.add("Free parking");
        gameBoard.add(new Place("Bygdøy Allé", 4400, Color.RED));
        gameBoard.add("Chance");
        gameBoard.add(new Place("Skarpsno", 4400, Color.RED));
        gameBoard.add(new Place("Slemdal", 4800, Color.RED));
        gameBoard.add(new Place("Grorud stasjon", 4000, Color.NONE));
        gameBoard.add(new Place("Karl Johans gate", 5200, Color.YELLOW));
        gameBoard.add(new Place("Stortorget", 5200, Color.YELLOW));
        gameBoard.add(new Place("Vannverket", 3000, Color.NONE));
        gameBoard.add(new Place("Torggata", 5600, Color.YELLOW));
        gameBoard.add("Go to prison!");
        gameBoard.add(new Place("Trosterudveien", 6000, Color.GREEN));
        gameBoard.add(new Place("Pilestredet", 6000, Color.GREEN));
        gameBoard.add("Community chest");
        gameBoard.add(new Place("Sinsen", 6400, Color.GREEN));
        gameBoard.add(new Place("Bryn stasjon", 4000, Color.NONE));
        gameBoard.add("Chance");
        gameBoard.add(new Place("Ullevål Hageby", 7000, Color.INDIGO));
        gameBoard.add("Luxury tax (pay kr 2000)");
        gameBoard.add(new Place("Rådhusplassen", 8000, Color.INDIGO));
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

    public void rollDice() {
        //random int på 2 terninger
        //oppdater player og gå på brettet
    }
}
