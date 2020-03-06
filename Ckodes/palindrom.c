#include<stdio.h>
void main(){
    int a,rem,n=1221;
    int k,p=0;
    k=n;
    while(n!=0){
        rem=n%10;
        p=p*10+rem;
        n=n/10;
    }
    
  if(k==p)
        printf("Yes");
    else
        printf("No");       
}