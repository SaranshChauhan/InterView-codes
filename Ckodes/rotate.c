#include<stdio.h>
#include<string.h>
void main(){
int i,n,p,len;
char str[20],str2[20];
printf("Enter String\t\n");
scanf("%s",str);
printf("Enter the Rotation of digits\t\n");
scanf("%d",&n);
printf("\n Output:\n");
len=strlen(str);
printf("%d",len);
	for(i=0;i<len;i++)
	{
	 p=(n+i)%len;
	 //printf("%d\n", p);
	 str2[p] = str[i]; 
	}
	str2[len]='\0';
	printf("Rotated String is %s\n",str2);
}
