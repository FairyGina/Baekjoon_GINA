#include<stdio.h>
int main(){
	int n,i,j,t,r=0,a[100],b[100];
	scanf("%d",&n);
	for(i=0;i<n;i++) scanf("%d",&a[i]);
	for(i=0;i<n;i++) scanf("%d",&b[i]);
	for(i=0;i<n-1;i++){
		for(j=i+1;j<n;j++){
			if(a[i]>a[j]){
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			if(b[i]<b[j]){
				t=b[i];
				b[i]=b[j];
				b[j]=t;
			}
		}
	}
	for(i=0;i<n;i++) r+=a[i]*b[i];
	printf("%d",r);
	return 0;
}