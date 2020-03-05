    interface A{
     //By default final,public,static
        int x=30;
        int y=40;
        public void sum(int x,int y); //Method-By default public,abstract
        
    }

    interface B{
        int x = 40;
        int y = 10;
        public void sub(int x,int y);
    }

    //Both Abstract Methods implemented by class C
    class C implements A,B{
    public void sum(int a,int b){
    System.out.println("Sum is "+(a+b));
    }

    public void sub(int a,int b){
        System.out.println("Substraction is "+(a-b));
    }
    }

    class Abstract{
    public static void main(String[] args) {     
    }}