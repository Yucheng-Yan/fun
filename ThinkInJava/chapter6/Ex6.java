package chapter6;

class SomeData {
    protected int a = 13;
}

class DataChanger {
    static void change(SomeData sd, int i) { sd.a = i; }
}

public class Ex6 {
    public static void main(String args[]) {
        SomeData x = new SomeData();
        //x.a = 14;
        System.out.println(x.a);
        DataChanger.change(x, 99);
        System.out.println(x.a);
        
    }
}