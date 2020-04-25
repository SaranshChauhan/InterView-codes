#include <stdio.h>

int main() {
    int i=0,a=10;
    int count=0;
    int rem[20];
    while(a!=0){
        rem[i]=a%2; //Rem to array
        a=a/2; //reduce Number
        count++; //counting steps
        i++; //increment & Decrement
    }
    
   printf("Decimal To Binary is :-\n");
    
    printf("\n");
    
    for(i=count-1;i>=0;i--)
    printf("%d\t",rem[i]);
    return 0;
}
