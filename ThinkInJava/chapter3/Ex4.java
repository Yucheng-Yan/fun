import java.util.*;

class VelocityCalculator {
    static float calculator(float d, float t) {
        return d/t;
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Random rand = new Random(79);
        float distance = rand.nextFloat(100);
        float time = rand.nextFloat(100) + 1;
        float v = VelocityCalculator.calculator(distance, time);
        System.out.println("The velocity = " + v);
    }
}

