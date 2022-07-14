//Standard Answer

class Tester {
    String s;
    {
        s = "Initializing string in Tester.";
        System.out.println(s);
    }
    Tester() {
        System.out.println("Tester()");
    }
}

public class Ex15 {
    public static void main(String[] args) {
        new Tester();
    }
}