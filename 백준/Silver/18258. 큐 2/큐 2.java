import java.io.*;
import java.util.*;
import java.util.function.*;

class Main{
    static ArrayList<Integer>q,a;
    static int f=-1,b=-1;

    public static void pr(int x){
        if(b==f) a.add(-1);
        else a.add(q.get(x));
    }

    public static void empty(){
        a.add((b==f)?1:0);
    }

    public static void push(int x){
        b++;
        q.add(x);
    }

    public static void pop(){
        front();
        if(f!=b) f++;
    }

    public static void size(){
        a.add(b-f);
    }

    public static void front(){
        pr(f+1);
    }

    public static void back(){
        pr(b);
    }

    public static void main(String[] args)throws Exception{
        
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String,Consumer<Integer>>c=new HashMap<>();
        Map<String,Runnable> m=new HashMap<>();

        c.put("push",Main::push);
        m.put("pop",Main::pop);
        m.put("size",Main::size);
        m.put("empty",Main::empty);
        m.put("front",Main::front);
        m.put("back",Main::back);

        int n=Integer.parseInt(I.readLine());
        q=new ArrayList<>(n); a=new ArrayList<>(n);


        for(int i=0;i<n;i++){
            String s=I.readLine();
            if(s.contains(" ")){
                String[] t=s.split(" ");
                c.get(t[0]).accept(Integer.valueOf(t[1]));
            }
            else m.get(s).run();
        }
        n=a.size();
        for(int i=0;i<n;i++) O.write(a.get(i)+"\n");
        O.flush();
    }
}