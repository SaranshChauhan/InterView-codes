//1st
/*
#include <stdio.h>

void main() {
int a=10,b=0;
b=(a++)+(a++); //a=12,b=21
//(10)+(11) increment to 12

a=(b++)+(b++); //a=43,b=23
//(21)+(22) increment to 23
printf("a=%d b=%d",a,b);
}

*/
/*
//2nd
#include<stdio.h>
int main(){
    int a;
    a=1,2,3,4;
    printf("%d",a);
}

*/
/*
//3rd
#include<stdio.h>
int main(){
    static int i=5;
    if(--i){
        main();
        printf("%d",i);
    }
}

*/
//4th

#include<stdio.h>
int main()
{
    int i,j;
    printf("%d",scanf("%d %d",&i,&j));
}


//5th
/*
#include<stdio.h>
main()
{
    main();
}
*/

//6th
/*
#include<stdio.h>
int main()
{
  int a=2;
  a=a++ + ~++a;
  printf("%d",a);
  return 0;
}
//6

*/



