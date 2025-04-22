import java.io.*;
import static java.lang.Math.*;
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
        m.put('/',(a,b)->{
            if(a<0^b<0) return -(abs(a)/abs(b));
            return a/b;
        });

        StringTokenizer s=new StringTokenizer(I.readLine());

        int[] n=new int[3];
        char[] ir=new char[2];

        for(int i=0;i<2;i++){
            n[i]=Integer.parseInt(s.nextToken());
            ir[i]=s.nextToken().charAt(0);
        }
        n[2]=Integer.parseInt(s.nextToken());

        int r1=m.get(ir[1]).apply((m.get(ir[0]).apply(n[0],n[1])),n[2]);
        int r2=m.get(ir[0]).apply(n[0],m.get(ir[1]).apply(n[1],n[2]));

        if(r1<r2){
            n[0]=r1;
            n[1]=r2;
        }else{
            n[0]=r2;
            n[1]=r1;
        }
        
        as.append(n[0]).append('\n').append(n[1]);

        O.write(as+"\n");
        O.flush();
    }
}