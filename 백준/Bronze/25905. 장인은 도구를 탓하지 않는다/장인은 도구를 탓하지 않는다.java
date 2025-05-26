import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Double> nb=new ArrayList<>(10);
        for(int i=0;i<10;i++){
            double ip=Double.parseDouble(I.readLine());
            nb.add(ip);
        }
        Collections.sort(nb,Comparator.reverseOrder());
        
        double res=1;
        for(int i=0;i<9;i++){
            res*=nb.get(i)/(i+1)*10;
        }
        System.out.print(String.format("%.6f",res));
    }
}