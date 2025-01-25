import java.util.Scanner;
import java.math.BigDecimal;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.print(new BigDecimal(a/b).stripTrailingZeros());
    }
}