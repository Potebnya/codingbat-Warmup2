package com.potebnya.StartJava.CodainBat.WarmUp2;

//Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//
//        countXX("abcxx") → 1
//        countXX("xxx") → 2
//        countXX("xxxx") → 3
public class countXX {
    int countXX(String str) {
        int a = 0;
        int overlapping = 1;
        for (int i = 0; i < str.length(); i++) {

            String tmp = str.substring(i, i + 1);
            if (tmp.equals("x")) a++;
            if (tmp.equals(" ")) overlapping++;
        }
        if (a != 0) a = a - overlapping;
        else a = 0;
        return a;
    }

}
