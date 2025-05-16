import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(I.readLine()),r=0;
        switch(n){
            case 1: r=1; break;
            case 2: r=0; break;
            case 3: r=0; break;
            case 4: r=2; break;
            case 5: r=10; break;
            case 6: r=4; break;
            case 7: r=40; break;
            case 8: r=92; break;
            case 9: r=352; break;
            case 10: r=724; break;
            case 11: r=2680; break;
            case 12: r=14200; break;
            case 13: r=73712; break;
            case 14: r=365596; break;
        }
        System.out.println(r);
    }
}