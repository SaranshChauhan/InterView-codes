#include <stdio.h>

union val {
  int int_num;
  float fl_num;
  char str[20]; 
};
int main() {  
  union val test; //var of val type

  test.int_num = 123;
  test.fl_num = 98.76;
  strcpy(test.str, "hello");

  printf("%d\n", test.int_num);
  printf("%f\n", test.fl_num);
  printf("%s\n", test.str);
  return 0;
}

/*
Firstly, the memory allocate equal to float(largest datatype).

& rest will store in the same memory blocks one by one.

& You can access only one value at a time.

Union is a user difined data type in C programming.

It allows different data types to be stored in the same memory locations.

Union provides an efficient way of reusing the memory location, as only one of its members can be accessed at a time.

*/
