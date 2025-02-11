package U7T3;

import java.util.ArrayList;

public class Digits {
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num) {
        /* to be implemented in part (a) */
        digitList = new ArrayList<Integer>();
        int number = num;
        if(num == 0) {
            digitList.add(0);
        }
        while(number > 0) {
            int last = number % 10;
            digitList.add(0, last);
            number /= 10;
        }
    }
    
    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing() {
        /* to be implemented in part (b) */
        int temp = digitList.get(0);
        for(int i = 1; i < digitList.size(); i ++) {
            if(digitList.get(i) <= temp) {
                return false;
            }
            temp = digitList.get(i);
            
        }
        return true;
    }
}

