package lab8_shupesmithsherry;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author s509086
 */
public class Lab8_ShupeSmithSherry 
{
   public static void main(String[] args) throws FileNotFoundException 
	{
            //initialization of variables for centurion game
            Centurion playCenturion = new Centurion();

            
            //initialization of variables for countdown
            countdown playCountdown = new countdown();
            
            
            //initialization of variables for acrostics
            Acrostics playAcrostics = new Acrostics();
            
            
            //initialization of variables for beheadments
            
            
            
            //initialization of variables for ghosts
            
            
            
            //main driver variables
            int choice = 9;
            Scanner choiceScanner = new Scanner(System.in);
            
            
            
            while(choice != 5){
                System.out.println("Pick a game, any game:\n"+
                                   "0. Centurion\n"+
                                   "1. Countdown\n"+
                                   "2. Acrostics\n"+
                                   "3. Beheadments\n"+
                                   "4. Ghosts\n"+
                                   "5. Quit\n");
                System.out.print("Choice: ");
                choice = choiceScanner.nextInt();
                switch (choice){
                    case 0: playCenturion.playGame();
                        break;
                    case 1: playCountdown.PlayGame();
                        break;
                    case 2: playAcrostics.acrosticsGame();
                        break;
                        
                        
                        
                        
                    case 5: System.exit(0);  
                        
                        
                    default: System.out.println("\nNO NO NO BAD STOP NO AAAAAAAH\n");
                        break;
                }
            }
        }
}
