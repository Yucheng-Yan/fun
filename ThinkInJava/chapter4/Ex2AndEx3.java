import java.util.*;
import static net.mindview.util.Print.*;

public class Ex2AndEx3 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt(100);
        while(true) {
            int num = rand.nextInt(100);
            System.out.println("i = " + i + ", num = " + num);
            if(num > i)
                System.out.println(">>>num > i");
            else if(num == i)
                System.out.println(">>>num == i");
            else
                System.out.println(">>>num < i");
            i = num;
        }
    }
}








// //Standard answer
// import static net.mindview.util.Print.*;
// import java.util.*;

// public class Ex2 {
// 	public static void main(String[] args) {
// 		Random rand1 = new Random();
// 		Random rand2 = new Random();
// 		for(int i = 0; i < 25; i++) {
// 			int x = rand1.nextInt();
// 			int y = rand2.nextInt();
// 			if(x < y) print(x + " < " + y);
// 			else if(x > y) print(x + " > " + y);
// 			else print(x + " = " + y);
// 		}
// 		Random rand3 = new Random();
// 		Random rand4 = new Random();
// 		for(int i = 0; i < 25; i++) {
// 			int x = rand3.nextInt(10);
// 			int y = rand4.nextInt(10);
// 			if(x < y) print(x + " < " + y);
// 			else if(x > y) print(x + " > " + y);
// 			else print(x + " = " + y);
// 		}
// 	}
// }