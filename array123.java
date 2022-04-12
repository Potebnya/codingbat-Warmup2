package com.potebnya.StartJava.CodainBat.WarmUp2;

//Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
//
//
//        array123([1, 1, 2, 3, 1]) → true
//        array123([1, 1, 2, 4, 1]) → false
//        array123([1, 1, 2, 1, 2, 3]) → true
public class array123 {
    public boolean array123(int[] nums) {
        boolean one = false;
        boolean two = false;
        boolean three = false;

        for (int a = 0; a < nums.length; a++) {
            if (nums[a] == 1 && one == false) one = true;

            if (nums[a] == 2 && one == true) two = true;

            if (nums[a] == 3 && two == true) three = true;
        }
        if (three) {
            return true;
        }
        return false;
    }

}
