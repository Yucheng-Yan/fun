import java.util.*;
import static net.mindview.util.Print.*;

class Barking{
    void Sound() {
        print("Bark!");
    }
}

class Howling{
    void Sound() {
        print("How!");
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Barking b = new Barking();
        Howling h = new Howling();
        b.Sound();
        h.Sound();
    }
}