#include<stdio.h>
#include<string.h>
int main(){
  int t;
  char a[26];
  for(int i=0;i<26;i++) a[i]='A'+i;
  scanf("%d",&t);
  while(t--){
    int i,j,res=0,c[26]={0};
    char s[1001];
    scanf("%s",s);
    for(i=0;i<strlen(s);i++){
      for(j=0;j<26;j++){
        if(s[i]==a[j]) c[j]++;
      }
    }
    for(i=0;i<26;i++) if(c[i]==0) res+=a[i];
    printf("%d\n",res);
  }
  return 0;
}