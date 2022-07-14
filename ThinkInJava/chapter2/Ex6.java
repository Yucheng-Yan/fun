// public class Ex6 {
//     public static void main(String[] args) {
//         int storage(String s) {
//             return s.length * 2;
//         }

//         Integer i = storage("asd");
//         System.out.println(i);
//     }
// }

//Standard answer
public class Ex6 {
    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }
        StoreStuff x = new StoreStuff();
        System.out.println(x.storage("hi"));
    }
}