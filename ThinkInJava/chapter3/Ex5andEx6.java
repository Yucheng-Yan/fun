import java.util.*;

// class Dog {
//     String name;
//     String says;
// }

// public class Ex5andEx6 {
//     public static void main(String[] args){
//         Dog Spot = new Dog();
//         Dog Scruffy = new Dog();
//         Spot.name = "Spot";
//         Scruffy.name = "Scruffy";
//         Spot.says = "Ruff!";
//         Scruffy.says = "Wurf!";
//         System.out.println(Spot.name + " says " + Spot.says);
//         System.out.println(Scruffy.name + " says " + Scruffy.says);

//         Dog Snoby = new Dog();
//         Snoby = Spot;
//         Snoby.name = Spot.name = "guy zi";
//         Snoby.says = Spot.says = "guy zi";
//         System.out.println("Snoby's name == Spot's name ->" + Snoby.name.equals(Spot.name));
//        // System.out.println("Snoby's says == Spot's says ->" + Snoby.says.equals(Spot.says));
//        System.out.println("Snoby == Spot ->" + Snoby.equals(Spot));
//     }
// }

//Standard answer
class Dog {
	String name;
	String says;
	void setName(String n) {
		name = n;
	}
	void setSays(String s) {
		says = s;
	}
	void showName() {
		System.out.println(name);
	}
	void speak() {
		System.out.println(says);
	}
}

public class Ex5andEx6 {
	public static void main(String[] args) {
		Dog spot = new Dog();
		spot.setName("Spot");
		spot.setSays("Ruff!");
		Dog scruffy = new Dog();
		scruffy.setName("Scruffy");
		scruffy.setSays("Wurf!");
		spot.showName();
		spot.speak();
		scruffy.showName(); 
		scruffy.speak();
		Dog butch = new Dog();
		butch.setName("Butch");
		butch.setSays("Hello!");
		butch.showName();
		butch.speak();
		System.out.println("Comparison: ");
		System.out.println("spot == butch: " + (spot == butch));
		System.out.println("spot.equals(butch): " + spot.equals(butch));
		System.out.println("butch.equals(spot): " + butch.equals(spot));
		System.out.println("Now assign: spot = butch");
		spot = butch;
		System.out.println("Compare again: ");
		System.out.println("spot == butch: " + (spot == butch));
		System.out.println("spot.equals(butch): " + spot.equals(butch));
		System.out.println("butch.equals(spot): " + butch.equals(spot));
		System.out.println("Spot: ");
		spot.showName();
		spot.speak();
		System.out.println("Butch: ");
		butch.showName();
		butch.speak();
			
	}
}