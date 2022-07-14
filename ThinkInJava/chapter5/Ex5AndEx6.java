import java.util.*;
import static net.mindview.util.Print.*;

// class Dog {

//     String bark(Barking b) {
//         return "Barking";
//     }   

//     String bark(Howling h) {
//         return "Howling";
//     }   
// }
// class Barking{}
// class Howling{}

// public class Ex5AndEx6 {
//     public static void main(String[] args) {
//         Barking b = new Barking();
//         Howling h = new Howling();
//         Dog d1 = new Dog();
//         Dog d2 = new Dog();
//         print(d1.bark(b));
//         print(d2.bark(h)); 
//     }
// }

//Standard answer
class Dog {
	void bark() {System.out.println("quiet");}
	void bark(char c) {System.out.println("cawcaw");}
	void bark(byte b) {System.out.println("barkbark");}
	void bark(short s) {System.out.println("slurpslurp");}
	void bark(int i) {System.out.println("iyow");}
	void bark(long L) {System.out.println("lalala");}
	void bark(float f) {System.out.println("fififoofum");}
	void bark(double d,int i) {System.out.println("dodo");}
    void bark(int i, double d) {System.out.println("dodo2");}
} 	


public class Ex5AndEx6 {
	public static void main(String[] args) {
		Dog d = new Dog();
		char c = 'c';
		byte b = 0;
		short s = 0;
		d.bark();
		d.bark(c);
		d.bark(b);
		d.bark(s);
		d.bark(1);
		d.bark(1L);
		d.bark(1.0f);
		d.bark(1.0, 1);
        d.bark(1, 1.0);
	}
}