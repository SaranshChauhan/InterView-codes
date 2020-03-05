public class prime
{	
	public int n;
	public int i;
	boolean flag = false;
 	public void calPrime(int n)
 {
	for(i=2;i<n;i++)
	{
		if(n%i==0)
	   {
		flag = true;
		break;
	   }//end If
	}//End For
	
	if(flag==false){
	System.out.println("Number is Prime");}
	else{
	System.out.println("Number is Not Prime");}	
 }//End of CalPrime Method	

	public static void main(String[] args)
	{
		  prime p = new prime();
		  p.calPrime(29);
	}	

}// End of Main
