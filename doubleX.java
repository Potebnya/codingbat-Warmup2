package com.potebnya.StartJava.CodainBat.WarmUp2;

//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//
//        doubleX("axxbb") → true
//        doubleX("axaxax") → false
//        doubleX("xxxxx") → true
public class doubleX {
    boolean doubleX(String str) {
        if (str.length() <= 1) return false;
        String FoundX = "x";
        int number = 0;
        for (; number < 2; number++) {
            String firstTmp = str.substring(number, number + 1);
            if (firstTmp.equals(FoundX)) {
                String secodTmp = str.substring(number + 1, number + 2);
                if (secodTmp.equals(FoundX)) {
                    return true;
                }
            }
        }
        return false;
    }

}
