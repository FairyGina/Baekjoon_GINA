import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));        int n=Integer.parseInt(I.readLine()),hour=-1;
        int[] ha=new int[n],ra=new int[n],ta=new int[n];

        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(I.readLine());
            ha[i]=Integer.parseInt(st.nextToken());
            ra[i]=Integer.parseInt(st.nextToken());
            ta[i]=Integer.parseInt(st.nextToken());
        }
        L:while(hour++<182500){
            for(int i=0;i<n;i++){
                int ch=hour%ha[i];
                if(ra[i]<ta[i]){
                    if(ra[i]<ch&&ch<ta[i]) continue L;
                }else{
                    if(ch>ra[i]||ch<ta[i]) continue L;
                }
            }
            break;
        }
        System.out.print(hour<182500?hour:"impossible");
    }
}