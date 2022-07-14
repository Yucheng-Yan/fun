import java.util.*;
import static net.mindview.util.Print.*;


enum Currency {
    FEN, JIAO, YUAN;
}

class Cash {
    Currency amount;
    Cash(Currency amount) {
        this.amount = amount;
    }
    void describe() {
        System.out.print("The order of ");
        switch(amount) {
            case FEN:   System.out.print("fen");
                        break;
            case JIAO:  System.out.print("jiao");
                        break;
            case YUAN:  System.out.print("yuan");
                        break;
        }
        
        print(" is " + amount.ordinal());
    }
}

public class Ex22 {
    public static void main(String[] args) {
        Cash
            fen = new Cash(Currency.FEN),
            jiao = new Cash(Currency.JIAO),
            yuan = new Cash(Currency.YUAN); 
        fen.describe();
        jiao.describe();
        yuan.describe();
    }
}