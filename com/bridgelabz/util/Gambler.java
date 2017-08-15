/******************************************************************************
 *  Purpose: determines no of winning in gambling.
 * 
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

public class Gambler 
{ 

    public static void main(String[] args) 
	{
        int mAmount = Integer.parseInt(args[0]);    
        int mGoal   = Integer.parseInt(args[1]);    
        int mTrials = Integer.parseInt(args[2]);    

        int mBets = 0;     
        int mWins = 0;        

        
        for (int i = 0; i < mTrials; i++) 
	{
            int mEarn = mAmount;

            while (mEarn > 0 && mEarn < mGoal) 
		{
                	mBets++;

                	if (Math.random() < 0.5)    
             		mEarn++;     
                	else                                   
                	mEarn--;     
            	}
            		if (mEarn == mGoal) 
            		mWins++;                
        }


        System.out.println(mWins + " wins of " + mTrials);
        System.out.println("Percent of games won = " + 100.0 * (float)mWins / (float)mTrials);
        System.out.println("Avg # bets = " + 1.0 * (float)mBets / (float)mTrials);
	}

}
