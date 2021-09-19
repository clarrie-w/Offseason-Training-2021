public class Vehicle {
    public int numWheels;
    public String colour;
    public String placeOfProduction;
    public int speed;
 
    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }
    
    public Vehicle(int numWheels, String colour, String placeOfProduction, int speed) {
        this.numWheels = numWheels;
        this.colour = colour;
        this.placeOfProduction = placeOfProduction;
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed++;
    }

    public void decreaseSpeed() {
        speed--;
    }

}
