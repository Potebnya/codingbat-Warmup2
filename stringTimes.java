package com.potebnya.StartJava.CodainBat.WarmUp2;

//Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//
//        stringTimes("Hi", 2) → "HiHi"
//        stringTimes("Hi", 3) → "HiHiHi"
//        stringTimes("Hi", 1) → "Hi"
public class stringTimes {

    public String stringTimes(String str, int n) {
        if (n == 0) return "";
        n = n -2;

        String strHi = str;
        int i= 0;
        for ( ; i <= n;i++){
            str = str + strHi;
        }
        return  str;

    }

}
