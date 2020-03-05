class Outer{
   private int i = 90;
    int j = 10;
    class Inner{
        //In Inner class all the outer class variables are Accessable irrespectable of access modifiers.
        void inAdd(){
         System.out.println("Sum Value is "+i+j); // 9010
         System.out.println("Sum of "+i+" And "+j+" is "+(i+j)); //Use brackets to sum the Integer variables
         System.out.println(i+j+" is the sum");
        }
    }}

class InOutClass{
    public static void main(String[] args) { 
        System.out.println("Object 1");      
        System.out.println("Inner Class Call");
        Outer obj = new Outer();
        Outer.Inner ic = obj.new Inner(); //creating the object of Inner Class
        ic.inAdd();

       
    }
}