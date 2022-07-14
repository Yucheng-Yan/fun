import java.util.*;

public class Ex16 {
    public static void main(String[] args) {
        String[] ls = {"get", "the", "fuck", "off"};
        for(int i = 0; i < ls.length; i++) {
            System.out.println(ls[i]);
        }

        String[] ls2;
        ls2 = new String[4];
        ls2[0] = "get";
        ls2[1] = "the";
        ls2[2] = "fuck";
        ls2[3] = "off";
        System.out.println(Arrays.toString(ls2));
    }
}