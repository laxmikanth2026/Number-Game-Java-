import java.util.*;
public class NumberGame
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int chances = 8;
	    int finals = 0;
	    boolean playAgain=true;
	    System.out.println("Welcome to Number Game: ");
	    System.out.println("Hey Buddy you have about " + chances + " chances to win the game");
	    while(playAgain){
	        int rand =  (int)(Math.random()*(100-1+1)+1);  
	        boolean guess=false;
	        for(int i =0 ; i<chances ;i++){
	            System.out.println("Chance " + (i+1) + " Enter your guess");
	            int user = sc.nextInt();
	            if(user==rand){
	                guess=true;
	                finals+=1;
	                System.out.println("You won it.");
	                break;
	            }
	            else if(user>rand){
	                System.out.println("Too High");
	            }
	            else{
	                System.out.println("Too low");
	            }
	        }
	        if(guess == false){
	            System.out.println("Sorry , You have lost the game. The number is " + rand);
	        }
	        System.out.println("Do you want to playAgain(yes/No)");
	        String p = sc.next();
	        playAgain=p.equalsIgnoreCase("yes");
	        
	    }
	    System.out.println("Hope you enjoyed game");
	    System.out.println("Here is your score: "+finals);
	    
	    
	    
	    
	}
}
