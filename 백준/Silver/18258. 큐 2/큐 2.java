import java.io.*;
import java.util.*;
import java.util.function.*;

class Main{
    static Deque<Integer> d;
    public static int e(Supplier<Integer> s){
        return d.isEmpty()?-1:s.get();
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String,Consumer<Integer>>c=new HashMap<>();
        Map<String,Supplier<Integer>>m=new HashMap<>();
        c.put("push",x->d.addLast(x));
        m.put("pop",()->e(d::pollFirst));
        m.put("size",()->d.size());
        m.put("empty",()->d.isEmpty()?1:0);
        m.put("front",()->e(d::peekFirst));
        m.put("back",()->e(d::peekLast));
        int n=Integer.parseInt(I.readLine());
        d=new ArrayDeque<>(n);
        while(n-->0){
            String s=I.readLine();
            if(s.contains(" ")){
                String[] t=s.split(" ");
                c.get(t[0]).accept(Integer.valueOf(t[1]));
            } else O.write(m.get(s).get()+"\n");
        }
        O.flush();
    }
}