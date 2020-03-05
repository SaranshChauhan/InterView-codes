class Data{
    public int a,b;
    public int mm(int a,int b){
       return a+b;
    }

    public long x,y;
    public long mm(long x,long y){
        return (x*y);
    }
    
    public float m,n;;
    public float mm(float m,float n){
        return (m+n);
    }
    
    public double i,k;
    public double mm(double i,double k){
        return (i*k);
    }
    
    public static void main(String args[]) {
    Data a = new Data();
    System.out.println("First One is "+a.mm(12,8)+"\n Second One is "+a.mm(25.0,4.0));
    /*By Default Float Value Considered as Double
    & Integer Value Considered as Integer
    -----More Specific-----
    float f = 2.5f; //float
    double d = 2.5; //double
    int i = 40; //integer
    long l = 40l; //long 
    */

}
}
