import java.io.*;
import java.util.*;

class Main {
    static String noans="Keine Loesung";

    public static String mkip(String ip){
        if(ip.length()%2!=0) return noans;
        
        char[] mk=new char[ip.length()/2];
        for(int i=0,j=0;i<ip.length();i+=2,j++){
            if(ip.charAt(i)!=ip.charAt(i+1)) return noans;
            mk[j]=ip.charAt(i);
        }

        return new String(mk);
    }

    public static String mkans(String tip){
        String ip=mkip(tip);
        if(ip.charAt(0)=='K') return noans;

        Deque<Character> dq1=new ArrayDeque<>(),dq2=new ArrayDeque<>();
        
        StringBuilder ans=new StringBuilder();
        char tc=' ';
        for(char c:ip.toCharArray()){
            if(c=='<'){
                if(dq2.isEmpty()){
                    dq1.offer(c);
                    tc='[';
                }else{
                    dq2.pop();
                    tc=']';
                }
            }else{
                if(dq1.isEmpty()){
                    dq2.offer(c);
                    tc='[';
                }else{
                    dq1.pop();
                    tc=']';
                }
            }
            ans.append(tc);
        }

        if(!dq1.isEmpty() || !dq2.isEmpty()) return noans;
        return ans.toString();
    }

    public static void main(String[] args) throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        System.out.print(mkans(I.readLine()));
    }
}