#include <stdio.h>
/*
//1st Method
int main() {
int a,b;
a=75;
b=25;
while(a!=b)
{
    if(a>b)
    a-=b;
    else
    b-=a;
}
printf("%d",a);
    return 0;
}*/

//2nd Method
void main()
{
    int a,b,i,gcd;
    a=75;
    b=25;
    for(i=1;i<=a && i<=b;++i)
    {
     if(a%i==0 && b%i==0)
      gcd=i;
    }
    printf("%d",gcd);
}
