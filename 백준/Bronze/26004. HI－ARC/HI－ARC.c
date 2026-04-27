#include<stdio.h>
#include<string.h>
int main(){
	char s[100001];
	int i,m,a[5]={0};
	scanf("%d %s",&m,s);
	for(i=0;i<strlen(s);i++){
		if(s[i]=='H') a[0]++;
		else if(s[i]=='I') a[1]++;
		else if(s[i]=='A') a[2]++;
		else if(s[i]=='R') a[3]++;
		else if(s[i]=='C') a[4]++;
	}
	for(i=0;i<5;i++) if(m>a[i]) m=a[i];
	printf("%d",m);
	return 0;
}