public class Vehicle {
    // attribute/instance variable -  mention syntax we learned last week
    public int numWheels;
    public String colour;
    public String placeOfProduction;
    public int speed;
 
    // constructor -- tell them to make note that it's a constructor
    /*Syntax
    keyword Class(parameters) {
        do stuff/store parameter values to variables
    }
    */
    public Vehicle(int numWheels) { // mention parameter syntax
        this.numWheels = numWheels;
    }
    
    public Vehicle(int numWheels, String colour, String placeOfProduction, int speed) {
        this.numWheels = numWheels;
        this.colour = colour;
        this.placeOfProduction = placeOfProduction;
        this.speed = speed;
    }
    
    // getter method
    /*Syntax
    keyword type name() {
        return value;
    }
    */
    public int getSpeed() {
        return speed;
    }

    // setter methods
    /*Syntax
    keyword void name() {
        do stuff
    }
    */
    public void increaseSpeed() {
        speed++;
    }

    public void decreaseSpeed() {
        speed--;
    }

}
