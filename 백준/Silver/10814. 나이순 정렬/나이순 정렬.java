import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(I.readLine());
        Object[][] on=new Object[n][3];
        for(int i=0;i<n;i++){
            StringTokenizer s=new StringTokenizer(I.readLine());
            on[i][0]=s.nextToken();
            on[i][1]=s.nextToken();
            on[i][2]=i;
        }
        Arrays.sort(on,(a,b)->{
            int ta=Integer.parseInt((String)a[0]),tb=Integer.parseInt((String)b[0]);
            
            if(ta!=tb) {
                return Integer.compare(ta,tb);
            } else {
                return Integer.compare((Integer)a[2],(Integer)b[2]);
            }
        });
        for(int i=0;i<n;i++) O.write(on[i][0]+" "+on[i][1]+"\n");
        O.flush();
    }
}