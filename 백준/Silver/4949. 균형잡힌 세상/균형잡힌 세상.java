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
                return false;
            }
        }
        return sk.empty();
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while(!(s=I.readLine()).equals(".")){
            sk=new Stack<>();
            as.append(bf(s)?"yes":"no").append('\n');
        }
        System.out.println(as);
    }
}