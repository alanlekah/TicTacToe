
/**
 * Class that sets the rules for the Tic Tac Toe game.
 * 
 * @author Nathan Klair, Alan Lekah 
 * @version October 18, 2012
 */
public class Rules
{
    private int turn;
    private boolean winner;
    private boolean h;
    
    /**
     * Constructor for objects of class Rules
     */
    public Rules()
    {
        turn = 1;
    }
    
    /**
     * Method to check for winner in Board class
     * 
     * @param  b   The Board object
     * @return     true or false value if someone is a winner
     */
    public boolean isWinner(Board b)
    {
        Board win = b;

        if(turn%2 == 1)
        {
            if(((win.getPosValue(1)).equals(Board.X)) && (win.getPosValue(2)).equals(Board.X) && (win.getPosValue(3)).equals(Board.X))
            {
                winner = true;
            }
            else if(((win.getPosValue(4)).equals(Board.X)) && (win.getPosValue(5)).equals(Board.X) && (win.getPosValue(6)).equals(Board.X))
            {
                winner = true;
            }
            else if(((win.getPosValue(7)).equals(Board.X)) && (win.getPosValue(8)).equals(Board.X) && (win.getPosValue(9)).equals(Board.X))
            {
                winner = true;
            }
            else if(((win.getPosValue(1)).equals(Board.X)) && (win.getPosValue(4)).equals(Board.X) && (win.getPosValue(7)).equals(Board.X))
            {
                winner = true;
            }
            else if(((win.getPosValue(2)).equals(Board.X)) && (win.getPosValue(5)).equals(Board.X) && (win.getPosValue(8)).equals(Board.X))
            {
                winner = true;
            }
            else if(((win.getPosValue(3)).equals(Board.X)) && (win.getPosValue(6)).equals(Board.X) && (win.getPosValue(9)).equals(Board.X))
            {
                winner = true;
            }
            else if(((win.getPosValue(1)).equals(Board.X)) && (win.getPosValue(5)).equals(Board.X) && (win.getPosValue(9)).equals(Board.X))
            {
                winner = true;
            }
            else if(((win.getPosValue(3)).equals(Board.X)) && (win.getPosValue(5)).equals(Board.X) && (win.getPosValue(7)).equals(Board.X))
            {
                winner = true;
            }
        }
        else if(turn%2 == 0)
        {
            if(((win.getPosValue(1)).equals(Board.O)) && (win.getPosValue(2)).equals(Board.O) && (win.getPosValue(3)).equals(Board.O))
            {
                winner = true;
            }
            else if(((win.getPosValue(4)).equals(Board.O)) && (win.getPosValue(5)).equals(Board.O) && (win.getPosValue(6)).equals(Board.O))
            {
                winner = true;
            }
            else if(((win.getPosValue(7)).equals(Board.O)) && (win.getPosValue(8)).equals(Board.O) && (win.getPosValue(9)).equals(Board.O))
            {
                winner = true;
            }
            else if(((win.getPosValue(1)).equals(Board.O)) && (win.getPosValue(4)).equals(Board.O) && (win.getPosValue(7)).equals(Board.O))
            {
                winner = true;
            }
            else if(((win.getPosValue(2)).equals(Board.O)) && (win.getPosValue(5)).equals(Board.O) && (win.getPosValue(8)).equals(Board.O))
            {
                winner = true;
            }
            else if(((win.getPosValue(3)).equals(Board.O)) && (win.getPosValue(6)).equals(Board.O) && (win.getPosValue(9)).equals(Board.O))
            {
                winner = true;
            }
            else if(((win.getPosValue(1)).equals(Board.O)) && (win.getPosValue(5)).equals(Board.O) && (win.getPosValue(9)).equals(Board.O))
            {
                winner = true;
            }
            else if(((win.getPosValue(3)).equals(Board.O)) && (win.getPosValue(5)).equals(Board.O) && (win.getPosValue(7)).equals(Board.O))
            {
                winner = true;
            }
        }

        else
        {
            winner = false;
        }
        turn++;
        return winner;
    }
    
    /**
     * A Method to Check if a Space in Tic-Tac-Toe is Already Filled
     * 
     * @param  e   of type int to reference tic-tac-toe position number
     * @param  b   The Board object
     * @return     boolean value if a space is filled or not
     */ 
    public boolean isFilled(int e, Board b)
    {
        Board win = b;
        
        if (e == 1)
        {
            String f = win.getPosValue(1);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        else if (e == 2)
        {
            String f = win.getPosValue(2);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        else if (e == 3)
        {
            String f = win.getPosValue(3);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        else if (e == 4)
        {
            String f = win.getPosValue(4);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        else if (e == 5)
        {
            String f = win.getPosValue(5);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        else if (e == 6)
        {
            String f = win.getPosValue(6);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        else if (e == 7)
        {
            String f = win.getPosValue(7);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        else if (e == 8)
        {
            String f = win.getPosValue(8);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        else if (e == 9)
        {
            String f = win.getPosValue(9);   
            if (f.equals(Board.X) || f.equals(Board.O))
            {
                h = true;
            }
            else 
            {
                h = false;
            }
        }
        
        return h;
    }
    
    /**
     * Return turn number
     * @return   int of turn number
     */
    public int getTurn()
    {
        return turn;
    }
    
     /**
     * Set Turn Number Back to 1
     */
    public void resetTurn()
    {
        turn = 1;
    }
    
     /**
     * Reset Winner Value Back to False
     */
    public void resetWinner()
    {
        winner = false;
    }
}
