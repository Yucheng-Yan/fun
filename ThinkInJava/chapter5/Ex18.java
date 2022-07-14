import java.util.*;
import static net.mindview.util.Print.*;

class Tester {
    Tester(String s) {
        print("Enter constructor ->" + s);
    }
}

public class Ex18 {
    public static void main(String[] args) {
        //Tester t = new Tester("fuck");
        Tester[] t_ls = new Tester[3];
        for(int i = 0; i < t_ls.length; i++) {
            t_ls[i] = new Tester("fuck");
        }
        print(Arrays.toString(t_ls));
    }
}