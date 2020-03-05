public class fabb
{
int a=0;
int b=1;
int c;
int len;
public void fabcci(int len){
for(int i=0;i<len;i++){
c=a+b;
System.out.println(c+" ");
a=b;
b=c;
}}

public static void main(String[] args) {
fabb fbseries = new fabb();
fbseries.fabcci(5);    
}

}