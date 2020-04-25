/*
atof() takes one string as input and it returns one double by converting the input string to double.
atoi() is similar to atof(). It takes one string as the input, convert it to an integer and returns it.
atol() is used to convert a string to a long value.
*/


//ATOI
#include <stdio.h>
#include <stdlib.h>
int main() {
    char *str="12345";
    int x = atoi(str);
    printf("%d",x);
    return 0;
}

//ATOF
#include <stdio.h>
#include <stdlib.h>

int main(){
	char number[5] = "12345";

	float numberFloat = atof(number);

	printf("Floating value is %f ",numberFloat);

}

//ATOL
#include <stdio.h>
#include <stdlib.h>
int main(){
  char number[5] = "12345";
  long numberLong = atol(number);
  printf("Long value is %ld ",numberLong);
}

//All In One
#include <stdio.h>
#include <stdlib.h>
int main(){
  char number[5] = "abcde";
  float numberFloat = atof(number);
  int numberInt = atoi(number);
  long numberLong = atol(number);
  printf("Float value is %f \n",numberFloat);
  printf("Int value is %d \n",numberInt);
  printf("Long value is %ld \n",numberLong);
}
