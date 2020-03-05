class Arm{
    public int num;
    public void calArm(int num){
        String s = String.valueOf(num);
        int len = s.length();
        int num2 = num;
        int arm = 0;
        //While loop to Cal the Armstrong Number.
        while(num != 0){
        int rem = num % 10;
        arm = (int)Math.pow(rem,len)+arm;
        num/=10;     
        }
      
        System.out.println(num2+"  " +arm);
    if(num2==arm){
        System.out.println("ArmStrong");
    }
    else{
        System.out.println("Not ArmStrong");
    }
    }

    public static void main(String[] args) {
        Arm no = new Arm();
        no.calArm(153);
        System.out.println("=========================================================================");
    }
}