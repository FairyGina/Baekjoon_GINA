import java.io.*;
import java.util.*;
import java.util.function.*;
class Main{
    static Deque<Integer> d;
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String,Consumer<Integer>>c=new HashMap<>();
        Map<String,Supplier<Integer>>m=new HashMap<>();
        c.put("push",x->d.addLast(x));
        m.put("pop",()->d.isEmpty()?-1:d.pollFirst());
        m.put("size",()->d.size());
        m.put("empty",()->d.isEmpty()?1:0);
        m.put("front",()->d.isEmpty()?-1:d.peekFirst());
        m.put("back",()->d.isEmpty()?-1:d.peekLast());
        int n=Integer.parseInt(I.readLine());
        d=new ArrayDeque<>(n);
        StringBuilder a=new StringBuilder();
        while(n-->0){
            String s=I.readLine();
            if(s.contains(" ")){
                String[] t=s.split(" ");
                c.get(t[0]).accept(Integer.valueOf(t[1]));
            } else{
                a.append(m.get(s).get()).append("\n");
            }
        }
        O.write(a+"\n");
        O.flush();
    }
}