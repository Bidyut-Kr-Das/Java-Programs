public class fibonacci_recursion {
    
    static void fibonacci(int a, int b,int elements){
        int sum;
        if(elements>2){
            if(elements!=2){
                sum=a+b;
                a=b;
                b=sum;
                elements--;
                System.out.print(","+sum);
                fibonacci(a, b, elements);
            }
            else{
                sum=a+b;
                System.out.print(sum);   
            }
        }
    }
    public static void main(String[] args) {
        //printing the initial two values seperately;
        System.out.print("0");
        System.out.print(",1");
        //Calling the recursive function;
        fibonacci(0,1,6);
    }
}
