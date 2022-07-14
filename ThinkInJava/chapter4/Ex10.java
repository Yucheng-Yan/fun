import java.util.*;
import static net.mindview.util.Print.*;

public class Ex10 {
    static int Thousand(int i) {
        return (i / 1000);
    }

    static int Hundred(int i) {
        return ((i - (Thousand(i) * 1000)) / 100);
    }

    static int Ten(int i) {
        return ((i - (Thousand(i) * 1000) - (Hundred(i) * 100)) / 10);
    }

    static int One(int i) {
        return ((i - (Thousand(i) * 1000) - (Hundred(i) * 100) - (Ten(i) * 10)) / 1);
    }


    static public void main(String[] args) {
        for(int i = 1001; i < 9999; i++) {
            if(i % 100 == 0)
                continue;
            int a = Thousand(i);
            int b = Hundred(i);
            int c = Ten(i);
            int d = One(i);

            if(((a*10 + b) * (c*10 + d)) == i)
                print(i);

            else if(((a*10 + b) * (d*10 + c)) == i)
                print(i);

            else if(((a*10 + c) * (b*10 + d)) == i)
                print(i);

            else if(((a*10 + c) * (d*10 + b)) == i)
                print(i);

            else if(((a*10 + d) * (b*10 + c)) == i)
                print(i);

            else if(((a*10 + d) * (c*10 + b)) == i)
                print(i);

            else if(((b*10 + a) * (c*10 + d)) == i)
                print(i);

            else if(((b*10 + a) * (d*10 + c)) == i)
                print(i);

            else if(((b*10 + c) * (a*10 + d)) == i)
                print(i);

            else if(((b*10 + c) * (d*10 + a)) == i)
                print(i);

            else if(((b*10 + d) * (a*10 + c)) == i)
                print(i);

            else if(((b*10 + d) * (c*10 + a)) == i)
                print(i);

            else if(((c*10 + a) * (b*10 + d)) == i)
                print(i);

            else if(((c*10 + a) * (d*10 + b)) == i)
                print(i);

            else if(((c*10 + b) * (a*10 + d)) == i)
                print(i);

            else if(((c*10 + b) * (d*10 + a)) == i)
                print(i);

            else if(((c*10 + d) * (a*10 + b)) == i)
                print(i);

            else if(((c*10 + d) * (b*10 + a)) == i)
                print(i);

            else if(((d*10 + a) * (b*10 + c)) == i)
                print(i);

            else if(((d*10 + a) * (c*10 + b)) == i)
                print(i);

            else if(((d*10 + b) * (c*10 + a)) == i)
                print(i);

            else if(((d*10 + b) * (a*10 + c)) == i)
                print(i);

            else if(((d*10 + c) * (a*10 + b)) == i)
                print(i);

            else if(((d*10 + c) * (b*10 + a)) == i)
                print(i);

            else 
                print(i + "is not a Vampire Numbers!");


        }

        // int i = 1004;
        // print(Thousand(i));
        // print(Hundred(i));
        // print(Ten(i));
        // print(One(i));
    }
}