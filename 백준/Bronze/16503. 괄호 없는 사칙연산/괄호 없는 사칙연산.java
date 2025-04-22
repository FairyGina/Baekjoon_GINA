import java.io.*;
import java.util.*;
import java.util.function.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder as=new StringBuilder();

        Map<Character,BiFunction<Integer,Integer,Integer>> m=new HashMap<>();
        m.put('+',(a,b)->a+b);
        m.put('-',(a,b)->a-b);
        m.put('*',(a,b)->a*b);
        m.put('/',(a,b)->a/b);

        StringTokenizer s=new StringTokenizer(I.readLine());

        int a=Integer.parseInt(s.nextToken());
        char q=s.nextToken().charAt(0);
        int b=Integer.parseInt(s.nextToken());
        char w=s.nextToken().charAt(0);
        int c=Integer.parseInt(s.nextToken());

        int r1=m.get(w).apply((m.get(q).apply(a,b)),c),r2=m.get(q).apply(a,m.get(w).apply(b,c));

        as.append(Math.min(r1,r2)).append('\n').append(Math.max(r1,r2));

        O.write(as+"\n");
        O.flush();
    }
}