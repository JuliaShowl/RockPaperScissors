/* Julia Showl y Andrea Gil-Lopez
 * Mod 8
 */
import java.util.Scanner;
public class rockPaperScissorsMain {

	private static Scanner s;

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
	s = new Scanner(System.in);
	rockPaperScissors p = new rockPaperScissors();
	int x = 0;

	while (x!=-1)
	{
		System.out.println("Choose weapon:\nRock = 1\nPaper = 2\nScissors = 3\nUse -1 to end the game.");
		x = s.nextInt();
		p.setPlayer(x);
		System.out.println(p.determineWinner());
    }
    }
}