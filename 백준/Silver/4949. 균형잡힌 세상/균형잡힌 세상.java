import java.io.*;
import java.util.*;
class Main{
    static Stack<Character> sk;
    public static boolean bf(String s){
        int l=s.length();
        for(int i=0;i<l;i++){
            char t=s.charAt(i);
            if(t=='[') sk.push(']');
            if(t=='(') sk.push(')');
            if(!(t==')'||t==']')) continue;
            if(!sk.empty()&&t==sk.peek()) sk.pop();
            else{
                sk.push(t);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while(!(s=I.readLine()).equals(".")){
            StringTokenizer st=new StringTokenizer(s);
            sk=new Stack<>();
            while (st.hasMoreTokens()){
                if(bf(st.nextToken())) break;
            }
            as.append(sk.empty()?"yes":"no").append('\n');
        }
        System.out.println(as);
    }
}