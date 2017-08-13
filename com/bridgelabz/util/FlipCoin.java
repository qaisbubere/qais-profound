/****************************************************************************** 
 *  Purpose: Flip a coin and find possibilities of heads and tails.
 *
 *  @author  Qais Bubere
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/

public class FlipCoin
{
	public static void main(String args[])
	{
	//math.random() returns a value between 0.0 to 1.0
	// so it is heads or tails 50% of the time
	
	/*
	* 1 or 0 gives head, and between that gives tails
	*/

	if(Math.random() < 0.5)
		System.out.println("Heads");
	
	else
		System.out.println("tails");
	}
}