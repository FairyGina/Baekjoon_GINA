import java.io.*;
import java.util.*;

class Main{
    static String p;
    public static boolean c(int k){
        int rm=(p.charAt(0)-'0')%k;
        // System.out.println("처음 rm: "+rm);
        // System.out.println("처음 k: "+k);

        for(int i=1;i<p.length();i++){
            rm=(rm*10%k+(p.charAt(i)-'0')%k)%k;
            //System.out.println("rm: "+rm);
        }
        //System.out.println();
        return rm==0;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer s=new StringTokenizer(I.readLine());
        p=s.nextToken();
        int k=Integer.parseInt(s.nextToken());
        
        StringBuilder a=new StringBuilder("GOOD");
        

        ArrayList<Boolean> t=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=0;i<k;i++) t.add(true);
        for(int i=2;i<k;i++){
            if(t.get(i)){
                for(int j=2*i;j<k;j+=i){
                    t.set(j,false);
                }
            }
        }
        for(int i=2;i<k;i++){
            if(t.get(i)) r.add(i);
        }
        //for(Integer i:r) System.out.println(i);
        for(Integer i:r){
            if(c(i)){
                a.replace(0,a.length(),"BAD ").append(i);
                break;
            }
        }

        O.write(a+"\n");
        O.flush();
    }
}