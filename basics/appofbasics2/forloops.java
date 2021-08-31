package appofbasics2;

public class forloops {
    public static void main(String[] args) {
        System.out.println("For loop:");
        
        for (int x = 10; x > 0; x -= 1) {
            System.out.println(x);
        }

        System.out.println("While loop:");
        
        int x = 10;
        
        while (x > 0) {
            System.out.println(x);
            x -= 1;
        } 
    }
}
