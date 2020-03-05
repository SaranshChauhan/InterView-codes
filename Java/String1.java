/* DOUBLE EQUAL TO(==) checks for the OBJECTS(Memory) are same or not.*/ 

public class String1{
public void compare(){
        String s1 = "qwerty";
        String s2 = "qwerty";
        System.out.println(s1==s2);  //TRUE bcz of same string, point to same STRING POOL.
        String s3 = new String("qwerty");
        System.out.println(s1==s3); //FALSE bcz NEW KEYWORD will create String New STRING POOL.
    }
}

class abc {
    public static void main(final String[] args) {
        String1 s1 = new String1();
        s1.compare();
    }
}