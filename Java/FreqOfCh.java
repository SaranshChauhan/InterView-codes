import java.util.Scanner;

class FreqEach {
    public String s;
    public void Count(String s){
      //  String s = "aabbccddddd";
        char[] arr = s.toCharArray();
        int len = s.length();
        for(int i = 0; i < len; i++){
           int counter = 0;
            for(int j = 0; j < len; j++){
               if(j < i && arr[i] == arr[j]){ //To Not Count duplicates.
                break;
               }//Endif
               if(arr[j]==arr[i]){ //Counter for First Occurance
                  counter++;
               }//Endif
            }//Endfor
            if(counter > 0){
                System.out.println(arr[i]+" is "+counter+" times");
               }
        }//Endfor
    }//EndMethod
public static void main(String[] args) {
    FreqEach fqch = new FreqEach();
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine(); 
    sc.close();
    fqch.Count(str);
}

}//EOC