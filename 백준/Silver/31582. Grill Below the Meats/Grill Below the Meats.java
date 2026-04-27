import java.io.*;
//import java.util.*;
class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder as=new StringBuilder();
        as.append(".......................................1\n");
        for(int i=1;i<13;i++){
            as.append("1111111111111111111111111111111111111111\n");
        }
        as.append("1......................................2\n");
        for(int i=14;i<26;i++){
            as.append("2222222222222222222222222222222222222222\n");
        }
        as.append("2......................................3\n");
        for(int i=27;i<39;i++){
            as.append("3333333333333333333333333333333333333333\n");
        }
        as.append("3.......................................");
        System.out.print(as);
    }
}