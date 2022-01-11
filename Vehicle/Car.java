// import Vehicle;

public class Car extends Vehicle { // extends = inheritance of child class from parent class
    int mileage;
    int distanceThisSession;

    public Car(int numWheels, int mileage, int distanceThisSession) {
        super(numWheels);
        this.mileage = mileage;
        this.distanceThisSession = distanceThisSession;
    }

    public Car(int numWheels, String colour, String placeOfProduction, int speed, int mileage, int distanceThisSession) {
        super(numWheels, colour, placeOfProduction, speed);
        this.mileage = mileage;
        this.distanceThisSession = distanceThisSession;
    }

    public void setMileage() { // setter method used when we want to update values
        mileage += distanceThisSession;
    }

}
