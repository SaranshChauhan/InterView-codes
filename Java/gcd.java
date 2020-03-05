class Gcd{
//if a number divides both the numbers with 0 remainder.
    int a,b,flag;
    int i=1;
    public void gc(int a, int b){
        while(i<=a && i<=b){
       if(a%i==0 && b%i==0){
           flag=i;
            } 
       i++;
    }
    System.out.println("GCD of"+a+"and"+b+flag);
}

public static void main(String[] args){
    Gcd gn = new Gcd();
        gn.gc(40,50);
}

}

