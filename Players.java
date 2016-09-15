
/**
 * This class sets the names and the scores of the two players.
 * 
 * @author Nathan Klair and Alan Lekah 
 * @version October 24, 2012
 */
public class Players
{
    private String player1Name;
    private String player2Name;
    private int player1Score;
    private int player2Score;
    private String r;
    private int u;
    
    /**
     * Constructor for objects of class Players and sets player's scores to zero.
     */
    public Players()
    {
        player2Score = 0;
        player1Score = 0;
        player1Name = "Player 1";
        player2Name = "Player 2";
    }

    /**
     * A method that makes the playerNames instance variables set to the player's names.
     * 
     * @param  q  Of Type String of Player1's Name
     * @param  w  Of Type String of Player2's Name
     */
    public void setPlayerName(String q, String w)
    {
        player1Name = q;
        player2Name = w;
    }
    
     /**
     * A method that returns a player's name.
     * 
     * @param  An integer that indicates a player(1 = player one) (2 = player two)
     * @return     Player's name 
     */
    public String getPlayerName(int e)
    {
      if(e == 1)
      {
        r = player1Name;  
      }
      else if(e == 2)
      {
        r = player2Name;  
      }
      return r;
    }
    
     /**
     * A method that sets the player's score equal to a nwe value.
     * 
     * @param  Player name
     */
    public void setPlayerScore(String player)
    {
        
        if (player.equals(player1Name))
        {
           player1Score++;    
        }
        else if (player.equals(player2Name))
        {
           player2Score++; 
        }
    }
    
     /**
     * A method that returns the player's scores.
     * 
     * @param  Player name 
     * @return    Chosen player's score
     */
    public int getPlayerScore(String aPlayer)
    {
         if(aPlayer.equals(player1Name))
      {
        u = player1Score;  
      }
      else if(aPlayer.equals(player2Name))
      {
        u = player2Score;  
      }
      return u;
    }
}
