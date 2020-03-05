class Encap{
	private int a;
	public int b;
	public int sum(int a,int b){
	return (a+b);	
	}	
	
	public void seta(int a){
	this.a=a;	
	}
	
	public int geta(){
	return this.a;			
	}


	public static void main(String[] agrs){
	Encap obj=new Encap();
	
  	obj.seta(9);
	System.out.println(obj.sum(obj.geta(),5));
	}	
}
