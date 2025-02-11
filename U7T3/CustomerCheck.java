package U7T3;

import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        /* to be implemented in part (a) */
        double total = 0;
        for(MenuItem item : check) {
            total += item.getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        /* to be implemented in part (b) */
        boolean anySpecial = false;
        for(MenuItem item : check) {
            if(item.isDailySpecial()) {
                anySpecial = true;
            }
        }
        if(!anySpecial && totalPrices() > 40 ) {
            return true;
        }
        return false;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        /* to be implemented in part (c) */
        int customer = 0;
        for(MenuItem item : check) {
            if(item.isEntree()) {
                customer ++;
            }
        }
        double price = totalPrices();
        if(customer >=6) {
            price *= 1.2;
        }
        if(couponApplies()) {
            price -= 0.25 * totalPrices();
        }
        return price;
    }
}