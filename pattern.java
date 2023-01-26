public class pattern {
    //pattern 1
    static void pattern1(){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.format("\n");
        }
    }
    //pattern 2
    static void pattern2(){
        for(int i=4;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.format("\n");
        }
    }
    //pattern 3
    static void pattern3(){
        for(int i=4;i>0;i--){
            for(int j=0;j<=4;j++){
                if(j<i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.format("\n");
        }
    }
    //pattern 4
    static void pattern4(){
        for(int i=4;i>0;i--){
            for(int j=4;j>0;j--){
                if(j>i){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" *");
                }
            }
            System.out.printf("\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("pattern 1--");
        pattern1();
        System.out.println("pattern 2--");
        pattern2();
        System.out.println("pattern 3--");
        pattern3();
        System.out.println("pattern 4--");
        pattern4();
    }
}
