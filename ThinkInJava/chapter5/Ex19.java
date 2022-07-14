import java.util.*;
import static net.mindview.util.Print.*;

public class Ex19 {
    static void f(String... args) {
        for(String s : args)
            print(s);
    }

    public static void main(String[] args) {
        f(new String[]{"abc", "bcb"});
    }
}