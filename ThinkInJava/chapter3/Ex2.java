class Tank {
    float level;
}

public class Ex2 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 2.71828f;
        t2.level = 3.14159f;
        System.out.println("t1.level = " + t1.level);
        System.out.println("t2.level = " + t2.level);
        t1 = t2;
        System.out.println("t1.level = " + t1.level);
        System.out.println("t2.level = " + t2.level);
        t2.level = 123;
        System.out.println("t1.level = " + t1.level);
        System.out.println("t2.level = " + t2.level);

    }
}