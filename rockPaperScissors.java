/* Julia Showl y Andrea Gil-Lopez
 * Mod 8
 */
import java.util.Random;
public class rockPaperScissors {
	Random r = new Random();
	private int  win, loss, tie, compPick, uPick;
	private String computerPick, userPick, winner;
    
    rockPaperScissors()
	{
        uPick = 4;
        compPick = 4;
        userPick = null;
        computerPick = null;
		win=0;
		loss=0;
		tie=0;
	}
	
	public void reset()
	{
		win=0;
		loss=0;
		tie=0;
	}
	
	public void setPlayer(int p)
	{
        if(p == -1){
            uPick = p;
        }
        else if(p >= 1 && p <= 3){
            uPick = p;
        }
        else{
            System.out.println("Not a valid entry");
        }
	}
	
	public int getComp()
	{
        compPick = r.nextInt(3+1);
        if(compPick == 0) compPick = 1;
        return compPick;
    }
	
	public String determineWinner()
	{
        if(uPick == -1){
            return stats();
        }
        getComp();
        setComptuerString();
        setUserString();
		if(uPick == compPick)
		{
			winner = "The computer picked " + computerPick  + " and you picked " + userPick + " , it's a tie!";
			tie++;
		}
		if ((uPick == 1 && compPick == 2) || (uPick == 2 && compPick == 3) || (uPick == 3 && compPick == 1))
		{
			winner = "The computer picked " + computerPick  + " and you picked " + userPick + " , you lost.";
			loss++;
		}
		if ((uPick == 1 && compPick == 3) || (uPick == 2 && compPick == 1) || (uPick == 3 && compPick == 2))
		{
			winner = "The computer picked " + computerPick  + " and you picked " + userPick + " , you won!";
			win++;
		}
		return winner;
    }
    
    private void setUserString(){
        if(uPick == 1){
            userPick = "Rock";
        }
        if(uPick == 2){
            userPick = "Paper";
        }
        if(uPick == 3){
            userPick = "Scissors";
        }
    }
    private void setComptuerString(){
        if(compPick == 1){
            computerPick = "Rock";
        }
        if(compPick == 2){
            computerPick = "Paper";
        }
        if(compPick == 3){
            computerPick = "Scissors";
        }
    }
	
	private String stats()
	{
		Integer.toString(tie);
		Integer.toString(win);
		Integer.toString(loss);
		return "Wins: " + win + "\nLosses: " + loss + "\nTies: " + tie;
	}
}