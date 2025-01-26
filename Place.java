// Place/square on the Monopoly board. Can be owned by a player

public class Place {
    private String name;
    private int price;
    private Color color;
    private Player owner;
    private int houses;
    private int hotel;
    private int rent;
    private int houseRent;
    private int hotelRent;

    public Place(String name, int price, Color color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Player getOwner() {
        return owner;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void buyHouse() {

        houses ++;
    }

    public void buyHotel() {
        if(hotel < 1) {
            hotel ++;
        }
        else {
            System.out.println("You already own a hotel here.");
        }
    }

    public int getRentAmount() {
        if(houses == 0 && hotel == 0) {
            return rent;
        }
        else if(houses != 0){
            return houseRent * houses;
        }
        else {
            return hotelRent;
        }
    }
}
