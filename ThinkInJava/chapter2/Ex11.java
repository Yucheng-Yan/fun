// class AllTheColorsOfTheRainbow {
//     int anIntegerRepresentingColors;
//     void ChangeTheHueOfTheColor(int newHue) {
//         anIntegerRepresentingColors = newHue;
//     }
// }


// public class Ex11 {
//     static class AllTheColorsOfTheRainbow {
//         int anIntegerRepresentingColors;
//         void ChangeTheHueOfTheColor(int newHue) {
//             anIntegerRepresentingColors = newHue;
//         }
//     }

//     static public void main(String[] args){

//         // class AllTheColorsOfTheRainbow {
//         //     int anIntegerRepresentingColors;
//         //     void ChangeTheHueOfTheColor(int newHue) {
//         //         anIntegerRepresentingColors = newHue;
//         //     }
//         // }

//         AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
//         rainbow.anIntegerRepresentingColors = 7;
//         System.out.println("rainbow.anIntegerRepresentingColors = " + rainbow.anIntegerRepresentingColors);
//         rainbow.ChangeTheHueOfTheColor(777);
//         System.out.println("rainbow.anIntegerRepresentingColors = " + rainbow.anIntegerRepresentingColors);
//     } 
// }

//Standard answer
public class Ex11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
        System.out.println("atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
        atc.changeColor(7);
        atc.changeTheHueOfTheColor(77);
        System.out.println("After color change, atc.anIntegerRepresentingColors = " + atc.anIntegerRepresentingColors);
        System.out.println("atc.hue = " + atc.hue);
    }
}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors = 0;
    int hue = 0;
    void changeTheHueOfTheColor(int newHue) {
        hue = newHue;
    }
    int changeColor(int newColor) {
        return anIntegerRepresentingColors = newColor;
    }
}