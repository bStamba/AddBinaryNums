import java.util.ArrayList;

public class AddBin {

    public String addBinary(String a, String b) {
        int total = 0;
        int binMulti = 1;
        String result = "";

        //Iterate through the binary string from right to left, where we will multiply
        //our val (0 or 1) by our binary multiplier, which doubles each iteration to
        //signify moving left a digit.
        for (int i = (a.length() - 1); i >= 0; i--) {
            int val = Integer.valueOf(String.valueOf(a.charAt(i)));
            total = total + val * binMulti;
            binMulti = binMulti * 2;
        }

        binMulti = 1;
        //Same as above, but for the second string, b.
        for (int i = (b.length() - 1); i >= 0; i--) {
            int val = Integer.valueOf(String.valueOf(b.charAt(i)));
            total = total + val * binMulti;
            binMulti = binMulti * 2;
        }

        //If total mod 2 = 0 then we add a 0 to the front, otherwise we add a 1. If the total
        //is actually 1, then we add 1 and we're done.
        while (total >= 1) {
            result = result + String.valueOf((total % 2));
            total = (total / 2) + (total % 2) ;
        }

        return result;
    }
}