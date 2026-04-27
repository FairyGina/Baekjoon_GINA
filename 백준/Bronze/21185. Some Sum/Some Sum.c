#include<stdio.h>
int main(){
	int n;
	scanf("%d",&n);
	printf(n%4==0?"Even":n%2!=0?"Either":"Odd");
}