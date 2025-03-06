import java.io.*;
import java.util.*;
class Main{
    static ArrayList<ArrayList<Integer>> a=new ArrayList<>();
    public static void A(int[] n,int x){
        for(Integer i:a.get(x)) n[i]++;
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s=new StringTokenizer(I.readLine());
        for(int i=0;i<5;i++){
            int d=Integer.parseInt(s.nextToken()),e=d;
            a.add(new ArrayList<>());
            for(int j=2;j<=e;j++){
                if(d%j==0){
                    a.get(i).add(j);
                    d/=j; e/=j;
                    j--;
                }
            }
        }
        int min=1000000;
        for(int i=0;i<3;i++){
            for(int j=i+1;j<4;j++){
                for(int k=j+1;k<5;k++){
                    int[] n1=new int[100],n2=new int[100],n3=new int[100];
                    A(n1,i); A(n2,j); A(n3,k);
                    int r=1;
                    for(int d=2;d<100;d++){
                        int m=0;
                        if(n1[d]>m) m=n1[d];
                        if(n2[d]>m) m=n2[d];
                        if(n3[d]>m) m=n3[d];
                        if(m!=0) r*=Math.pow(d,m);
                    }
                    if(r<min) min=r;
                }
            }
        }
        O.write(min+"\n");
        O.flush();
    }
}