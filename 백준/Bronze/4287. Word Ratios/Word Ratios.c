#include <stdio.h>
#include<string.h>
int main() {
    while(1){
      char l[21]="";
      gets(l);
      if(l[0]=='#') break;
      else{
        printf("%s ",l);
        int length=(strlen(l)-2)/3;
        for(int i=0, j=length+1,k=2*length+2; i<length;i++,j++,k++){
          if(l[k]+l[j]-l[i]>122) l[k]-=26;
          else if(l[k]+l[j]-l[i]<97) l[k]+=26;
          printf("%c",l[k]+l[j]-l[i]);
        }
        printf("\n");
      }
    }
    return 0;
}