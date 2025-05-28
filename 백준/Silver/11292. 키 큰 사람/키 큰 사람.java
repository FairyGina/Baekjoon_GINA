import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int n;
        LinkedHashMap<String,Double>tm=new LinkedHashMap<>();
        while((n=Integer.parseInt(I.readLine()))!=0){
            tm.clear();
            double max=0;
            for(int i=0;i<n;i++){
                StringTokenizer st=new StringTokenizer(I.readLine());
                String a=st.nextToken(); double b=Double.parseDouble(st.nextToken());
                if(max<b) max=b;
                tm.put(a,b);
            }
            for (Map.Entry<String,Double> et:tm.entrySet()){
                double td=et.getValue();
                if(td==max) as.append(et.getKey()).append(' ');
            }
            as.append('\n');
        }
        System.out.print(as);
    }
}