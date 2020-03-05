import java.util.Scanner;

class AskForArr{
public static void main(String[] args) {
int[] arr = new int[5];
Scanner sc1 = new Scanner(System.in);
int max = sc1.nextInt();
sc1.close();
Scanner sc2 = new Scanner(System.in);
for(int i =0; i < max; i++){  
    arr[i]=sc2.nextInt();
    }
    sc2.close();
    System.out.println("--::Array Is Now::--");
    for(int i = 0; i < max; i++) {
    System.out.println(arr[i]);
    }
  }
}