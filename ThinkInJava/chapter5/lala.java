class Test{
    boolean b;

    void printtest() {
        boolean a = b;
        System.out.println(a);
    }
}

public class lala {
    public static void main(String[] args) {
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2, j++) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}