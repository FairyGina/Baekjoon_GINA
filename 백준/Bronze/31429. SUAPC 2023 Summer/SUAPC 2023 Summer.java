import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader I=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter O=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(I.readLine());
        
        switch(n){
            case 1:
                O.write("12 1600\n");
                break;
            case 2:
                O.write("11 894\n");
                break;
            case 3:
                O.write("11 1327\n");
                break;
            case 4:
                O.write("10 1311\n");
                break;
            case 5:
                O.write("9 1004\n");
                break;
            case 6:
                O.write("9 1178\n");
                break;
            case 7:
                O.write("9 1357\n");
                break;
            case 8:
                O.write("8 837\n");
                break;
            case 9:
                O.write("7 1055\n");
                break;
            case 10:
                O.write("6 556\n");
                break;
            case 11:
                O.write("6 773\n");
                break;
        }
        O.flush();
    }
}