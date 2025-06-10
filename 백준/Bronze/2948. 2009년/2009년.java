import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.TextStyle;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(I.readLine());
        int d=Integer.parseInt(st.nextToken()),m=Integer.parseInt(st.nextToken());
        LocalDate dt=LocalDate.of(2009,m,d);

        String dw=dt.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ENGLISH);
        System.out.print(dw);
    }
}