import java.util.*;
import static net.mindview.util.Print.*;

// class Book {
//     boolean checkedOut = false;
//     Book(boolean checkOut) {
//         this.checkedOut = checkOut;
//     }
//     void checkIn() {
//         checkedOut = false;
//     }
//     protected void finalize() {
//         if(checkedOut)
//             print("Error: checked out");
//     }
// }

// public class Ex10 {
//     public static void main(String[] args) {
//         Book novel = new Book(true);
//         new Book(true);
//         //novel.checkIn();
//         //new Book(true, "The Three Musketeers").checkIn();
//         System.gc();
//     }
// }

//Standard answer
class WebBank {
	boolean loggedIn = false;
	WebBank(boolean logStatus) {
		loggedIn = logStatus;
	}
	void logIn() {
		loggedIn = true;
	}
	void logOut() {
		loggedIn = false;
	}
	protected void finalize() {
		if(loggedIn)
			System.out.println("Error: still logged in");
		// Normally, you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}

public class Ex10 {
	public static void main(String[] args) {
		WebBank bank1 = new WebBank(true);
		WebBank bank2 = new WebBank(true);
		// Proper cleanup: log out of bank1 before going home
		bank1.logOut();
		// Drop the reference, forget to cleanup:
		new WebBank(true);
		// Force garbage collection and finalization:
		System.gc();
	}	
} 