// class ATypeName {
//     static int i;
// }

// public class ex3{
//     public static void main(String[] args) {
//         ATypeName a = new ATypeName();
//         a.i = new Integer(1);
//         System.out.println(a.i);
//     }
// }

//Standard answer
public class ex3 {
    public static void main(String[] args) {
        class ATypeName {
            int i;
            double d;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();
    }
}