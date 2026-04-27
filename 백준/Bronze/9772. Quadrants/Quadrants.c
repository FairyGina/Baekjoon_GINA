#include<stdio.h>
int main(){
	float a,b;
	while(1){
		scanf("%f %f",&a,&b);
		if((a==0)||(b==0)) printf("AXIS\n");
		if((a==0)&&(b==0)) break;
		else{
			if((a>0)&&(b>0)) printf("Q1\n");
			if((a<0)&&(b>0)) printf("Q2\n");
			if((a<0)&&(b<0)) printf("Q3\n");
			if((a>0)&&(b<0)) printf("Q4\n");
		}
	}
	return 0;
}