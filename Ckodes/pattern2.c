#include<stdio.h>
void main(){
int i,j,n;
printf("Enter Size");
scanf("%d",&n);

for(i=0;i<n;i++){
    for(j=0;j<=4;j++){
     if(i%2==0)
     printf("*");
     else
      printf("#");
     }
    printf("\n");
  }
}