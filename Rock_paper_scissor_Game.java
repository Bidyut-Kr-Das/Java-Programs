import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor_Game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - represents Rock.");
        System.out.println("2 - represents Paper.");
        System.out.println("3 - represents Scissor.");
        

        
        byte point_comp=0;
        byte point_user=0;
        byte game_round = 0;
        while(game_round!=5){
            int comp_input = rand.nextInt(1, 4);
            System.out.print("Enter your choice:");
            int user_input = sc.nextInt();

            if(user_input ==1){
                switch(comp_input){
                    case 2 :
                    System.out.println("yaay you won!");
                    point_user++;                    
                    break;
                    case 3 :
                    System.out.println("Computer won!");
                    point_comp++;
                    break;
                    default:
                    System.out.println("Its a draw!");
                }
            }
            else if(user_input==2){
                switch(comp_input){
                    case 1 :
                        System.out.println("computer won!");
                        point_comp++;                    
                        break;
                    case 3 :
                        System.out.println("you won");
                        point_user++;
                        break;
                    default:
                        System.out.println("Its a draw!");
                }
                
            }
            else if(user_input==3){
                switch(comp_input){
                    case 1 :
                    System.out.println("computer won!");
                    point_comp++;                    
                        break;
                    case 2 :
                    System.out.println("you won");
                    point_user++;
                        break;
                        default:
                        System.out.println("Its a draw!");
                    }  
            }
            else{
                System.out.println("you have chosen wrong option");
                continue;
            }
            game_round++;
        }
        if(point_comp>point_user){
            System.out.println("computer won the match");
            System.out.println("The point is computer: "+point_comp+"you: "+point_user);
        }
        else if(point_comp==point_user){
            System.out.println("Its a draw!");
            System.out.println("The point is computer: "+point_comp+" you: "+point_user);
        }
        else{
            System.out.println("You won the match!");
            System.out.println("The point is computer: "+point_comp+" you: "+point_user);

        }
        sc.close();
    }
    
}
