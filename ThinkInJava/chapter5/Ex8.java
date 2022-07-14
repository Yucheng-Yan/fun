import java.util.*;
import static net.mindview.util.Print.*;

class Test {
    void func1() {
        this.func2();
        func2();
        }

    void func2() {
        print("this is test2" );
        } 
}

public class Ex8 {
    public static void main(String[] args) {
        Test t = new Test();
        t.func1();
    }
}