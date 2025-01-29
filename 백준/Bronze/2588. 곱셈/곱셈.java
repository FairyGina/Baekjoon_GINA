import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.printf("%d%n%d%n%d%n%d",b%10*a,b%100/10*a,b/100*a,a*b);
    }
}