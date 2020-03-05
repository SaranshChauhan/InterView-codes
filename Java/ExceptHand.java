class ExceptHand{
    public static void main(String[] args) {
        try{
        throw new myException(5); //throw is used to create a new Exception.
        } 
    catch(myException e) {
        System.out.println(e);
        }
    }}


     class myException extends Exception{
         private static final long serialVersionUID = 1L;
         int a;
      myException(int x){
        a=x;
    }
    public String toString(){
    return ("Code Number = "+a);

}}

