import java.util.*;
import static net.mindview.util.Print.*;

// class Test {
//     String s = "string";
//     Test() {
//         String s2;
//     }
// }

// public class Ex2 {
//     public static void main(String[] args) {
//         Test t = new Test();
//         print(t.s);
//         print(t.s2);
//     }
// }

//Standard answer
class Tester2 {
    String s1;
    String s2 = "hello";
    String s3;
    Tester2() { 
        s3 = "good-bye";
        String s4;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Tester2 t = new Tester2();
        print("t.s1: " + t.s1);
        print("t.s2: " + t.s2);
        print("t.s3: " + t.s3);
        print("t.s4: " + t.s4);
    }
}