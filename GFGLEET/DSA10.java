package GFGLEET;

import java.lang.*;

public class DSA10 {
    public static int appendCharacters(String s, String t) {
        int sindex = 0, tindex = 0;
        int tlen = t.length(), slen = s.length();
        while (sindex <slen && tindex <tlen) {

            if (s.charAt(sindex) == t.charAt(tindex)) {
                tindex++;
            }
            sindex++;
        }

        return tlen - tindex;
    }

    public static void main(String[] args) {
        int n = appendCharacters("coaching", "coding");
        System.out.println(n);
    }
}
