class Tank {
    float level;
}

public class Ex3 {
    static void f(Tank t) {
        t.level = 3.14159f;
    }
    public static void main(String[] args) {
        Tank t = new Tank();
        t.level = 2.71828f;
        System.out.println("t.level = " + t.level);
        f(t);
        System.out.println("t.level = " + t.level);
    }
}