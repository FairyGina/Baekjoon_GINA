import java.util.*;

class Solution {
    public String solution(String new_id) {
        StringBuilder sv=new StringBuilder(new_id),make=new StringBuilder();
        
        //1
        for(char c:sv.toString().toCharArray()){
            if(Character.isUpperCase(c)) make.append(Character.toLowerCase(c));
            else make.append(c);
        }
        sv=new StringBuilder(make);
        make=new StringBuilder();
        System.out.println(sv.toString());
        
        //2
        for(char c:sv.toString().toCharArray()){
            char cn=' ';
            if('0'<=c && c<='9') cn=c;
            else if('a'<=c && c<='z') cn=c;
            else if(c=='-' || c=='_' || c=='.') cn=c;
            make.append(cn);
        }
        sv=new StringBuilder(make.toString().replace(" ",""));
        make=new StringBuilder();
        System.out.println(sv.toString());
        
        //3
        sv.append('a');
        for(int i=0;i<sv.length()-1;i++){
            if(sv.charAt(i)=='.'){
                if(sv.charAt(i+1)=='.') continue;
                else make.append(sv.charAt(i));
            }else make.append(sv.charAt(i));
        }
        sv=new StringBuilder(make);
        make=new StringBuilder();
        System.out.println(sv.toString());
        
        //4
        int start=0, end=sv.length()-1;
        if(sv.charAt(0)=='.') start++;
        if(sv.charAt(sv.length()-1)=='.') end--;
        for(int i=start;i<=end;i++) make.append(sv.charAt(i));
        sv=new StringBuilder(make);
        make=new StringBuilder();
        System.out.println(sv.toString());
        
        //5
        if(sv.length()==0) sv.append("a");
        System.out.println(sv.toString());
        
        //6
        int ln=Math.min(sv.length(),15);
        for(int i=0;i<ln-1;i++) make.append(sv.charAt(i));
        //System.out.println(make.toString());
        
        if(sv.charAt(ln-1)!='.') make.append(sv.charAt(ln-1));
        sv=new StringBuilder(make);
        
        System.out.println(sv.toString());
        
        //7
        ln=sv.length();
        if(ln<3){
            make=new StringBuilder(sv);
            char tc=make.charAt(ln-1);
            for(int i=ln;i<3;i++) make.append(tc);
        }
        
        
        return make.toString();
    }
}