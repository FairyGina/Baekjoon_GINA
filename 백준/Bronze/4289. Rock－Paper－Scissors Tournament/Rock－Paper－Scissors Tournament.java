import java.util.*;
import java.io.*;
class Main{
    static int[] wsc=new int[101],lsc=new int[101];
    static int h1,h2;
    static char c1,c2;
    static void rps(char w1,char w2){
        if(c2==w1){
            wsc[h1]++;
            lsc[h2]++;
        }else if(c2==w2){
            wsc[h2]++;
            lsc[h1]++;
        }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringBuilder as=new StringBuilder();
        String s;
        while(!(s=I.readLine()).equals("0")){
            StringTokenizer st=new StringTokenizer(s);
            int n=Integer.parseInt(st.nextToken());
            int game=n*(n-1)/2*Integer.parseInt(st.nextToken());

            Arrays.fill(wsc,0);
            Arrays.fill(lsc,0);
            while(game-->0){
                st=new StringTokenizer(I.readLine());

                h1=Integer.parseInt(st.nextToken());
                c1=st.nextToken().charAt(0);
                h2=Integer.parseInt(st.nextToken());
                c2=st.nextToken().charAt(0);

                if(c1=='r'){
                    rps('s','p');
                }else if(c1=='s'){
                    rps('p','r');
                }else{
                    rps('r','s');
                }
            }
            for(int i=1;i<=n;i++){
                int num=wsc[i]+lsc[i];
                if(num<1){
                    as.append("-\n");
                }else{
                    as.append(String.format("%.3f",(double)wsc[i]/(double)(wsc[i]+lsc[i]))).append('\n');
                }
            }
            as.append('\n');
        }
        System.out.print(as);
    }
}