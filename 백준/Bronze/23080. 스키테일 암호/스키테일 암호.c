#include<stdio.h>
#include<string.h>
int main(){
	int n;
	char s[1001];
	scanf("%d %s",&n,s);
	for(int i=0;i<strlen(s);i+=n){
		printf("%c",s[i]);
	}
	return 0;
}