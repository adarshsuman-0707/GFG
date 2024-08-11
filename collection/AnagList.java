package collection;


import java.util.*;

public class AnagList {

    void fun1(String[] Sear) {
        HashSet<String> hs = new HashSet<>();
        HashSet<String> hs1 = new HashSet<>();
        
        for (int i = 0; i < Sear.length - 1; i++) {
            char[] c = Sear[i].toCharArray();
            char[] cs = Sear[i + 1].toCharArray();
            Arrays.sort(c);
            Arrays.sort(cs);
            
            for (int j = 0; j < c.length-1; j++) {
                if (c[j] == cs[j]) {
                    String ans = Sear[i + 1];
                    hs.add(ans);
                } else {
                    String ans = Sear[i + 1];
                    hs.remove(ans);
                    hs1.add(ans);
                }
            }
        }
        
        int k = 0;
        String[] names = new String[hs.size()];
        for (String name : hs) {
            names[k] = name;
            k++;
        }
        
        System.out.println(hs);
        // fun1(names); // Note: This line is commented out to avoid recursive call in this example
    }

    public static void main(String[] args) {
        String[] Sear = {"abba", "baba", "bbaa", "cfd", "cde"};
        AnagList l = new AnagList();
        l.fun1(Sear);
    }
}