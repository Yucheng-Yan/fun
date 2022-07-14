import java.util.*;
import static net.mindview.util.Print.*;


public class Ex9 {
    void Fibonacci(int i) {
        print(1);
        print(1);
        int j = 1;
        int k = 1;
        int s = j + k;
        for(int counter = 0; counter < (i - 2); counter++) {
            print(j + k);
            s = j + k;
            j = k;
            k = s;
        }
    }

    public static void main(String[] args) {
        Ex9 test = new Ex9();
        int num = Integer.parseInt(args[0]);
        test.Fibonacci(num);
    }
}

//Standard answer
// public class Ex9 {
//     int fib(int n) {
//         if(n < 2) return 1;
//         return (fib(n - 2) + fib(n - 1));
//     }

//     public static void main(String[] args) {
//         Ex9 f = new Ex9();
//         int k = Integer.parseInt(args[0]);
//         print("First " + k + " Fibonacci number(s): ");
//         for(int i = 0; i < k; i++) 
//             print(f.fib(i));
//     }
// }