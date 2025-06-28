import java.io.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        int awin=0,bwin=0,stat=0,asc=0,bsc=0;
        int t=Integer.parseInt(I.readLine());
        while(t-->0){
            String s=I.readLine();
            char c=s.charAt(0);
            int tm=Integer.parseInt(s.substring(2,4)),ts=Integer.parseInt(s.substring(5,7));
            int curt=tm*60+ts;
            if(c=='1'){
                awin++;
                if(awin==bwin){
                    bsc+=curt-stat;
                    stat=0;
                }else if(awin-bwin==1){
                    stat=curt;
                }
            }else{
                bwin++;
                if(awin==bwin){
                    asc+=curt-stat;
                    stat=0;
                }else if(bwin-awin==1){
                    stat=curt;
                }
            }
        }
        if(awin>bwin) asc+=2880-stat;
        else if(awin<bwin) bsc+=2880-stat;
        as.append(String.format("%02d:%02d\n%02d:%02d",asc/60,asc%60,bsc/60,bsc%60));
        System.out.print(as);
    }
}