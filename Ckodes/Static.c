#include<stdio.h>
void main(){
int x;
static int i = 50;
printf("Enter The value of X");
scanf("%d",&x);

switch(x){ 
case 'a':
i++;
printf("%d",i);
break;

case 98:
printf("%d",i+5);
break;

case 2:
printf("%d",i*5);
break;

default:
printf("%d",i/5);
}
}