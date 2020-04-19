#include <stdio.h>

int main() {
enum fan{                   //Allow user define datatype called as fan
on,off,trashy,ok           //Only these values are available for fan variable 
};                          //also values represented as 0,1,2,3 for on,off,trashy,ok 

int val;
scanf("%d",&val);

switch(val){
    case 1:
    printf("%d",on);
    break;
    
    case 2:
    printf("%d",off);
    break;
    
    case 3:
    printf("%d",trashy);
    break;
    
    case 4:
    printf("%d",ok);
    break;
    
    default:
    printf("Yu arr en di fault");
}
    return 0;
}
