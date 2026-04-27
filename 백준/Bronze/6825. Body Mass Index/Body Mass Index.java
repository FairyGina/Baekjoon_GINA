import java.io.*;
public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        Double h=Double.parseDouble(I.readLine()),w=Double.parseDouble(I.readLine());
        double bmi=h/(w*w);
        if(bmi>25) System.out.print("Overweight");
        else if(bmi>18.5) System.out.print("Normal weight");
        else System.out.print("Underweight");
    }
}
