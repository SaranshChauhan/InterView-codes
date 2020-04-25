#include<stdio.h>
#include<string.h>
void anagram(char[]);
int main() {
    char *str1="Satr";
    char *str2="aStr";
    int val;
   // if(strlen(str1)==strlen(str2))
    anagram(str1);
    anagram(str2);
     val=strcmp(str1,str2);
    if(val==0)
        printf("Anagram");
    else
        printf("Not anagram");
        
    return 0;
}

void anagram(char string[20]){
    int i;
    char c;
    for(i=0;i<strlen(string);i++){
      if(string[i]<string[i+1]){
        c=string[i];
        string[i]=string[i+1];
        string[i+1]=c;
      }
   }
}

/*
An anagram is a word or phrase that's formed by rearranging the letters of another word or phrase. 
For example, ram and mra or computer and puomcter
*/
