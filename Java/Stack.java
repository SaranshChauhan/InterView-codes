class Stack{
    public int max = 100;
    public int[] arr = new int[max];
    public int top;
    public int item;
    //Pushing to Stack Method
    public void push(int item){
    if(top >= max){
        System.out.println("Sorry! StackOverflow");
    }
    else{
        arr[top] = item;
        top = top +1;
        System.out.println(item+" Inserted At "+top);
    }
    }
    //Poping From Stack Method
    public void pop(){
        if(top<=0){
            System.out.println("Sorry! StackUnderFlow");
        }
        else{
            System.out.println(top+"removed Sucessfully");
            top--;
        }
    }
public static void main(String[] args) {
    Stack stk = new Stack();
    stk.push(1);
    stk.push(2);
    stk.push(3);
    stk.push(4);

    stk.pop();
    stk.pop();
}
}