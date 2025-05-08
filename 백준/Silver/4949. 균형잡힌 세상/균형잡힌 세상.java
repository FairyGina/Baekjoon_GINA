import java.io.*;
import java.util.*;
class Main{
    public static boolean bf(String s){
        int l=s.length();
        Stack<Character> sk=new Stack<>();
        for(int i=0;i<l;i++){
            char t=s.charAt(i);
            if(t=='[') sk.push(']');
            if(t=='(') sk.push(')');
            if(!(t==')'||t==']')) continue;
            if(sk.empty()||t!=sk.peek()){
                sk.push(t);
                return false;
            }
            sk.pop();
        }
        return sk.empty();
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        String s;
        while(!(s=I.readLine()).equals(".")){
            as.append(bf(s)?"yes":"no").append('\n');
        }
        System.out.println(as);
    }
}