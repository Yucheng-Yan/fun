public class Ex6 {
    static int test(int testval, int begin, int end) {
        if(begin > end) {
            System.out.print("Plz try again!");
            return -1;
        }
        else if(testval >= begin && testval <= end)
            return 1;
        else if(testval < begin || testval > end)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(test(1, 2, 3));
        System.out.println(test(2, 1, 3));
        System.out.println(test(2, 3, 1));    }
}