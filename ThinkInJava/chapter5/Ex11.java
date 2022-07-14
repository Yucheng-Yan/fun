//StandardAnswer
class WebBank {
    boolean loggedIn = false;
    WebBank(boolean logStatus) {
        loggedIn = logStatus;
    }
    void logOut() {
        loggedIn = false;
    }
    protected void finalize() {
        if(loggedIn)
            System.out.println("Error: still logged in");
    }
}

public  class Ex11 {
    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        new WebBank(true);
        new WebBank(true);
        //bank1.logOut();
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.print("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
    }
}

