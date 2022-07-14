import java.util.*;
import static net.mindview.util.Print.*;


enum Currency {
    FEN, JIAO, YUAN;
}

class Cash {
    Currency amount;
    Cash(Currency c) {
        this.amount = c;
    }
    void describe() {
        print("The order of ") + this.amount + " is " + this.amount.ordinal());
    }
}

public class Ex21 {
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