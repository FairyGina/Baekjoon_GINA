class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        if(n==1){
            int[] as=new int[slicer[1]+1];
            System.arraycopy(num_list,0,as,0,slicer[1]+1);
            return as;
        }else if(n==2){
            int ln=num_list.length-slicer[0];
            int[] as=new int[ln];
            System.arraycopy(num_list,slicer[0],as,0,ln);
            return as;
        }else if(n==3){
            int ln=slicer[1]-slicer[0]+1;
            int[] as=new int[ln];
            System.arraycopy(num_list,slicer[0],as,0,ln);
            return as;
        }else{
            int ln=(slicer[1]-slicer[0])/slicer[2]+1;
            int[] as=new int[ln];
            for(int i=0,j=slicer[0];i<ln;i++,j+=slicer[2]) as[i]=num_list[j];
            return as;
        }
    }
}