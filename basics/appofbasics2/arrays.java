package appofbasics2;

public class arrays {
    public static void main(String[] args){
        
        //String[] food = new String[4];
        
        String[] food = {"dumplings", "apple", "peanut butter", "oat milk"};
        // food[0] = "dumplings";
        // food[1] = "apple";
        // food[2] = "peanut butter";
        // food[3] = "oat milk";

        for (int i = 0; i < food.length; i++) {
            System.out.println(food[i]);
        }
    }
}
