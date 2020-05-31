public class Passenger {

    private String name;
    private int numberOfBags;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
    }

    public String getname() {
        return this.name;
    }

    public int getNumOfBags() {
        return this.numberOfBags;
    }
}
