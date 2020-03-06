#include<stdio.h>
void main(){
int i,j;
int k = 2;
for(i=0;i<4;i++){  
    for(j=0;j<k;j++)
     printf("*"); 
     printf("\n");
     for(j=0;j<k;j++)
     printf("*"); 
     printf("\n");
    k=k+2;  
 }
}
