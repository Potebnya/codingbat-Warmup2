package com.potebnya.StartJava.CodainBat.WarmUp2;
//Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
//
//
//        arrayFront9([1, 2, 9, 3, 4]) → true
//        arrayFront9([1, 2, 3, 4, 9]) → false
//        arrayFront9([1, 2, 3, 4, 5]) → false
public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {

        for( int a = 0; a < nums.length; a++){
            if(nums[a] == 9 && a <= 3) return true;
        }
        return false;
    }

}
