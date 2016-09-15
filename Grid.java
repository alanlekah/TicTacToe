
/**
 * Grid Displays Blank TicTacTie Board
 * 
 * @author Alan Lekah, Nathan Klair
 * @version October 17, 2012
 */
public class Grid
{
    private String p1_turn;
    private String p2_turn;
    
    /**
     * Constructor for objects of class Grid
     * @param b The Board object
     * @param p The Players object
     * @param r The Rules object
     */
    public Grid(Board b, Players p, Rules r)
    {
        clearBoard(b);
    }
    

    /**
     * Clear Existing X's and O's From Board and Print Blank Board - With Box Numbers
     * @param b The Board Object
     */
    public void clearBoard(Board b)
    {     
        b.setPosValue(Board.ONE, 1);
        b.setPosValue(Board.TWO, 2);
        b.setPosValue(Board.THREE, 3);
        b.setPosValue(Board.FOUR, 4);
        b.setPosValue(Board.FIVE, 5);
        b.setPosValue(Board.SIX, 6);
        b.setPosValue(Board.SEVEN, 7);
        b.setPosValue(Board.EIGHT, 8);
        b.setPosValue(Board.NINE, 9);
    }
    
    /**
     * Print Blank TicTacToe Board With Box Numbers (For Identifying the Squares)
     * @param b The Board object
     * @param p The Players object
     * @param r The Rules object
     */
    public void printBoard(Board b, Players p, Rules r)
    {                  
        String pos1 = b.getPosValue(1);
        String pos2 = b.getPosValue(2);
        String pos3 = b.getPosValue(3);
        String pos4 = b.getPosValue(4);
        String pos5 = b.getPosValue(5);
        String pos6 = b.getPosValue(6);
        String pos7 = b.getPosValue(7);
        String pos8 = b.getPosValue(8);
        String pos9 = b.getPosValue(9);
        String player1 = p.getPlayerName(1);
        String player2 = p.getPlayerName(2);
        int p1_score = p.getPlayerScore(player1);
        int p2_score = p.getPlayerScore(player2);
        int temp = r.getTurn();
        // System.out.println("TURN NUMBER IS: " + temp); # FOR DEBUG PURPOSES #
        
        if (temp % 2 == 1)
        {
            p1_turn = "<---";
            p2_turn = "";
        }
        else if (temp % 2 == 0)
        {
            p1_turn = "";
            p2_turn = "<---";
        }
        
        System.out.println("+---------------+---------------+---------------+");
        System.out.println("+               |               |               +");
        System.out.println("+       " + pos1 + "       |       " + pos2 + "       |       " + pos3 + "       +");
        System.out.println("+               |               |               +");
        System.out.println("+---------------+---------------+---------------+" + "         "  + player1 + ": " + p1_score + "  " + p1_turn);
        System.out.println("+               |               |               +");
        System.out.println("+       " + pos4 + "       |       " + pos5 + "       |       " + pos6 + "       +");
        System.out.println("+               |               |               +");
        System.out.println("+---------------+---------------+---------------+" + "         "  + player2 + ": " + p2_score + "  " + p2_turn);
        System.out.println("+               |               |               +");
        System.out.println("+       " + pos7 + "       |       " + pos8 + "       |       " + pos9 + "       +");
        System.out.println("+               |               |               +");
        System.out.println("+---------------+---------------+---------------+");        
    }
}
