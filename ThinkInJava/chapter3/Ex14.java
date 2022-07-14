public class Ex14 {
    static void comparer(String s, String t) {
        System.out.println("s == t -> " + (s == t));
        System.out.println("s != t -> " + (s != t));
        System.out.println("s.equals(t) -> " + s.equals(t));
        System.out.println("t.equals(s) -> " + t.equals(s));
    }



    public static void main(String[] args) {
        String s = "one", t = "two";
        comparer(s, t);
    }
}