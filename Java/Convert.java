public class Convert{
    public static void main(String[] args) {
    String s1 = "12345";
    System.out.println(s1+"as a string");

    //String to Int
    System.out.println(Integer.parseInt("12345")+s1.getClass().getName()); //To kmow the datatype

    //Int to String
    System.out.println(String.valueOf(12345));

    System.out.println("============================================================================================================");

    //String to Long 
    System.out.println(Long.parseLong("4567"));

    //Long to String
    System.out.println(String.valueOf(4567));

    //
    }
}