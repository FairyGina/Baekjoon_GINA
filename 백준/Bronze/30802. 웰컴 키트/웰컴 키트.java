import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] n=new int[10];
        for(int i=0;i<9;i++) n[i]=s.nextInt();
        for(int i=1;i<7;i++){
            n[9]+=n[i]/n[7];
            if(n[i]%n[7]!=0) n[9]++;
        }
        System.out.printf("%d%n%d %d",n[9],n[0]/n[8],n[0]%n[8]);
    }
}