/******************************************************************************
 *  Purpose: determines no of winning in gambling.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
public class Gambler { 

    public static void main(String[] args) {


        // gambler's stating bankroll
        // gambler's desired bankroll
        // number of trials to perform
        
        int amount  = Integer.parseInt(args[0]);    
        int goal   = Integer.parseInt(args[1]);    
        int trials = Integer.parseInt(args[2]);    


        // total number of bets made
        int bets = 0;

        // total number of games won        
        int wins = 0;        

        // Number of trials a gambler will perform
        for (int i = 0; i < trials; i++) {

            // checking the earning in each bet
            int earn = amount;
            while (earn > 0 && earn < goal) {
                bets++;
                if (Math.random() < 0.5) 
                
                // win $1
                earn++;     
                else                     

                // lose $1
                earn--;     
            }
            if (earn == goal) 

            //achieving desired goal
            wins++;                
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}
