/* Player for the Monopoly board. A player has a balance which can be increased
or decreased, a randomly chosen game piece, can be in prison and have free 
parking, and own houses and hotels.
1 arraylist for houses and 1 for hotels? */

public class Player {
    private String name;
    private int balance;
    private String gamePiece;
    private boolean inPrison;
    private boolean freeParking;
    private int currentPosition;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void goToPrison() {
        inPrison = true;
        System.out.println("You have the right to remain silent. Go to prison!");
    }

    public void exitPrison() {
        inPrison = false;
        System.out.println("Congratulations, you are free!");
    }

    public void setFreeParking() {
        freeParking = true;
    }

    public void removeFreeParking() {
        freeParking = false;
    }

    public boolean getParking() {
        return freeParking;
    }

    public void setGamePiece(String gamePiece) {
        this.gamePiece = gamePiece;
    }

    public void setPosition(int position) {
        currentPosition = position;
    }

    public int getPosition() {
        return currentPosition;
    }
}
