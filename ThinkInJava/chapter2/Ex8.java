// class Num {
//     static int i;
// }

// class Increment {
//     static void Increase() { Num.i++; }
// }
// public class Ex8 {
//     public static void main(String[] args) {
//         Num n1 = new Num();
//         Num n2 = new Num();
//         Num n3 = new Num();
//         Num n4 = new Num();
//         Num n5 = new Num();
//         Num n6 = new Num();
//         Num n7 = new Num();
//         Num n8 = new Num();
//         Num n9 = new Num();
//         Num n10 = new Num();
//         System.out.println(n1.i);
//         System.out.println(n2.i);
//         System.out.println(n3.i);
//         System.out.println(n4.i);
//         System.out.println(n5.i);
//         System.out.println(n6.i);
//         System.out.println(n7.i);
//         System.out.println(n8.i);
//         System.out.println(n9.i);
//         System.out.println(n10.i);
//         Increment.Increase();
//         System.out.println(n1.i);
//         System.out.println(n2.i);
//         System.out.println(n3.i);
//         System.out.println(n4.i);
//         System.out.println(n5.i);
//         System.out.println(n6.i);
//         System.out.println(n7.i);
//         System.out.println(n8.i);
//         System.out.println(n9.i);
//         System.out.println(n10.i);    
//     }
// }

//Standard answer
class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest.i++; }
}

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("StaticTest.i= " + StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        st1.i = 3;
        System.out.println("After st1.i = 3, ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        System.out.println("Create another StaticTest, st3.");
        StaticTest st3 = new StaticTest();
        System.out.println("st3.i = " + st3.i);

    }
}