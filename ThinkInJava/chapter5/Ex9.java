import java.util.*;
import static net.mindview.util.Print.*;

// class Test{
//     int num;
//     Test(int i){
//         this();
//         num += i;
//         print("Now num = " + num);
//         }
//     Test() {
//         num = 10;
//         print("num = " + num);
//     }
// }
// public class Ex9 {
//     public static void main(String[] args) {
//         Test t = new Test(7);
//     }
// }

//Standard answer
class Doc {
	Doc(int i) {
		this("MD");
		int yearsTraining = i;
		System.out.println("New doc with " + i + " years of training");
	}
	Doc(String s) {
		String degree = s;
		System.out.println("New doc with " + s + " degree");
	}	
	void intubate() {
		System.out.println("prepare patient");
		laryngoscopy();
	}
	void laryngoscopy() {
		System.out.println("use laryngoscope");
	}	
}
	
public class Ex9 {	
	public static void main(String[] args) {
		new Doc(8).intubate();		
	}		
}