#include<stdio.h>
#include<string.h>
void main(){
int i,j;
char str[20]="a!b@f#C$f%j";
for(i=0;str[i]!='\0';i++){
while(!((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z') || (str[i]=='\0'))){
    for(j=i;str[j]!='\0';j++){
        str[j]=str[j+1];
    }
}//endOfWhile

}//endOfFor
printf("\n%s\n",str);
}//EndOfMain
