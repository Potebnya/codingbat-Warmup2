package com.potebnya.StartJava.CodainBat.WarmUp2;

//Given an array of ints, return the number of 9's in the array.
//
//
//        arrayCount9([1, 2, 9]) → 1
//        arrayCount9([1, 9, 9]) → 2
//        arrayCount9([1, 9, 9, 3, 9]) → 3

public class arrayCount9 {
    public int arrayCount9(int[] nums) {
        int count = 0;
        int a = 0;
        for(; a < nums.length; a++){

            if(nums[a] == 9) count++;

        }
        return count;
    }
}
