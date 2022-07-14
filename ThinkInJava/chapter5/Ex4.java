class Test {
    Test() {
        System.out.println("This is just a test.");
    }

    Test(String s) {
        System.out.println(s);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Test t = new Test("balabala");
        Test t2 = new Test();
    }
}