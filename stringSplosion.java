package com.potebnya.StartJava.CodainBat.WarmUp2;
//Given a non-empty string like "Code" return a string like "CCoCodCode".
//
//
//        stringSplosion("Code") → "CCoCodCode"
//        stringSplosion("abc") → "aababc"
//        stringSplosion("ab") → "aab"
public class stringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for(int i = 0; i< str.length(); i++){
            result = result + str.substring(0, i+1);
        }
        return result;
    }

}
