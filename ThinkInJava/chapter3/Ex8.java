//Standard answer
public class Ex8 {
    public static void main(String[] args) {
        long n1 = 0xffff; // hexadecimal
        long n2 = 077777; //octal
        System.out.println("long n1 in hex = " + Long.toBinaryString(n1));
        System.out.println("long n2 in hex = " + Long.toBinaryString(n2));        
    }
}