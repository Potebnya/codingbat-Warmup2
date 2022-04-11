package com.potebnya.StartJava.CodainBat.WarmUp2;

//
//Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
//
//
//        frontTimes("Chocolate", 2) → "ChoCho"
//        frontTimes("Chocolate", 3) → "ChoChoCho"
//        frontTimes("Abc", 3) → "AbcAbcAbc"
public class frontTimes {
    public String frontTimes(String str, int n) {
        int i = 0;

        if (n == 0) return "";


        if (str.length() >= 3) {
            n = n - 1;
            String subString = str.substring(0, 3);
            str = "";
            for (; i <= n; i++) {
                str = str + subString;
            }
        } else {
            n = n - 2;
            String strHi = str;

            for (; i <= n; i++) {
                str = str + strHi;
            }
        }
        return str;
    }

}

