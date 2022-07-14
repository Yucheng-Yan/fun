//Standard answer
import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt();
        if(coin % 2 == 0) System.out.println(coin + "heads");
        else System.out.println(coin + "tails");
    }
}