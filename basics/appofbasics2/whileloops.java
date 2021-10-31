package appofbasics2;

public class whileloops {
    public static void main(String[] args) {
        int speedLimit = 50;
        int speed = 60;

        while (speed > speedLimit) {
            System.out.println(speed + ": SLOW DOWN!");
            speed -= 1;
        }

        System.out.println(speed);

    }
}
