import java.util.*;

class Solution {
    public String solution(String a, String b) {
        StringBuilder s1=new StringBuilder(a).reverse();
        StringBuilder s2=new StringBuilder(b).reverse();
        
        int ln1=s1.length(),ln2=s2.length();
        int maxln=Math.max(ln1,ln2);
        
        for(int i=ln1;i<maxln;i++) s1.append("0");
        for(int i=ln2;i<maxln;i++) s2.append("0");
        
        // System.out.println(s1);
        // System.out.println(s2);
        
        int sv=0;
        StringBuilder as=new StringBuilder();
        for(int i=0;i<maxln;i++){
            int tn=(s1.charAt(i)-'0')+(s2.charAt(i)-'0')+sv;
            sv=tn/10;
            tn%=10;
            as.append(tn);
        }
        if(sv>0) as.append(1);
        return as.reverse().toString();
    }
}