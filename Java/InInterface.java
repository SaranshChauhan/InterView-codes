/*  
IN INTERFACE
METHODS are BY DEFAULT PUBLIC,ABSTRACT
VARIABLES are BY DEFAULT PUBLIC,STATIC,FINAL
*/

interface One{
    void wake();
   
}

//interface TWO have ONE i/f previllage also,if a class implements the interface TWO then it has to define all methods from ONE,TWO
//i.e WAKE,BREAKFAST
interface Two extends One{
    void breakfast();
}
//iF a Class Implements i/f THREE then It has to define all the methods i.e WAKE,BREAKFAST,LUNCH.
interface Three extends Two{
    void lunch();
}

class Aone implements One{
    public void wake(){
        System.out.println("I Wake up at 5 AM");
    }
}

class Btwo implements Two{
    public void wake(){
        System.out.println("I wake up at 6 am");
    }
    public void breakfast(){
        System.out.println("I do breakfast at 9 am");
    }
}

class Cthree implements Three{
    public void wake(){
        System.out.println("I wake up at 7 am");
    }
    public void breakfast(){
        System.out.println("I do breakfast at 10 am");
    }
    public void lunch(){
        System.out.println("I have lunch at 8 PM");
    }
}

class InInterface{
public static void main(String[] args) {
    System.out.println("=================OBJECT1======================");
    //Object 1
    Aone ao = new Aone();
    ao.wake();
System.out.println("======================OBJECT2=====================");
    //Object2
    Btwo bt = new Btwo();
    bt.wake();
    bt.breakfast();
System.err.println("====================OBJECT3=====================");
    //object3
    Cthree ct = new Cthree();
    ct.wake();
    ct.breakfast();
    ct.lunch();
}

}

