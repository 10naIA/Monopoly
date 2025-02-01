//Program for playing Monopoly. Register players and pick game pieces for them.

public class PlayGame {

    public static void main(String[] args) {
        Gameboard gameboard = new Gameboard();
        Player tina = new Player("Tina", 30000);
        gameboard.addPlayer(tina);
        gameboard.pickGamePiece(tina);
        gameboard.rollDice(tina);
    }
}
    