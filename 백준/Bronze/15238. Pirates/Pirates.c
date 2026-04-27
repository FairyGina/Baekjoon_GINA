#include<stdio.h>
int main(){
	int n,i,j,z[26]={0};
	char a[26],s[1001];
	for(i=0;i<26;i++) a[i]='a'+i;
	scanf("%d %s",&n,s);
	for(i=0;i<n;i++) for(j=0;j<26;j++) if(s[i]==a[j]) z[j]++;
	for(n=0,i=0;i<26;i++) if(n<z[i]) n=z[i],j=i;
	printf("%c %d",a[j],n);
	return 0;
}