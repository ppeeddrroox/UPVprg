package pract2;



public class PRGDebugger {

    public static int countA (String s){
        if (s.length() == 0) {return 0;}
        else if (s.charAt(0) == 'a') { return 1 +countA(s.substring(1));}
        else {return countA(s.substring(1));}
    }

}
