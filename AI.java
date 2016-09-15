import java.util.Random;

/**
 * A Class That Sets Rules for Player Computer
 * 
 * @author Alan Lekah && Nathan Klair
 * @version 10/30/2012
 */
public class AI
{
    // instance variables
    private int turn;
    private String tempType;
    private int l;

    /**
     * Constructor for objects of class AI
     */
    public AI(Rules r)
    {
        int turn = r.getTurn();
    }

    /**
     * A Method that Updates Board Position Number with Computer Decision
     * 
     * @param  b   Object of type Board
     * @param  r   Object of type Rules
     * @param  AIPosition  Int of computer's decision on O position
     */
    public void takeTurn(Board b, Rules r, int AIPosition)
    {
        turn = r.getTurn(); 
        if ((turn % 2) == 1)
        {
            tempType = Board.X;
        }
        else
        {
            tempType = Board.O;
        }
        b.setPosValue(tempType, AIPosition);
    }
    
     /**
     * A Method that Chooses Which Position Would Prevent Player from Winning and Tries to Win
     * @param  b   Object of type Board
     * @param  r   Object of type Rules
     * @return int Position Number on Board
     */
    public int decidePosition(Board b, Rules r)
    {
        String p1 = b.getPosValue(1);
        String p2 = b.getPosValue(2);
        String p3 = b.getPosValue(3);
        String p4 = b.getPosValue(4);
        String p5 = b.getPosValue(5);
        String p6 = b.getPosValue(6);
        String p7 = b.getPosValue(7);
        String p8 = b.getPosValue(8);
        String p9 = b.getPosValue(9);

        if (p1.equals(p2)) l = 3;
        else if (p2.equals(p3)) l = 1;
        else if (p1.equals(p4)) l = 7;
        else if (p4.equals(p7)) l = 1;
        else if (p2.equals(p5)) l = 8;
        else if (p5.equals(p8)) l = 2;
        else if (p3.equals(p6)) l = 9;
        else if (p6.equals(p9)) l = 3;
        else if (p1.equals(p5)) l = 9; // Diag 3 in a row
        else if (p5.equals(p9)) l = 1;
        else if (p3.equals(p5)) l = 7;
        else if (p5.equals(p7)) l = 3;
        else if (p1.equals(p7)) l = 4;
        else if (p1.equals(p3)) l = 2; // Fill Middle Row/Column
        else if (p2.equals(p8)) l = 5;
        else if (p3.equals(p9)) l = 6;
        else if (p4.equals(p6)) l = 5;
        else if (p7.equals(p9)) l = 8;
        else if (p1.equals(p9)) l = 5;
        else if (p3.equals(p7)) l = 5;
        else
        {
            Random random = new Random();
            int random_number = random.nextInt(10);

            while (random_number == 0)
            {
                random_number = random.nextInt(10);
            }

            if (r.isFilled(random_number, b))
            {
                do
                {
                    random_number = random.nextInt(10);
                }
                while (r.isFilled(random_number, b));
            }
            
            l = random_number;
        }
        
        if (r.isFilled(l, b))
        {
            Random random = new Random();
            int random_number = random.nextInt(10);

            while (random_number == 0)
            {
                random_number = random.nextInt(10);
            }

            if (r.isFilled(random_number, b))
            {
                do
                {
                    random_number = random.nextInt(10);
                }
                while (r.isFilled(random_number, b));
            }
            
            l = random_number;
        }
        
        return l;        
    }
    
    /**
     * A Method to Return Computer's Decision on Position Placement
     * @return Int Computer's Decision
     */
    public int getComputerMove()
    {
        return l;
    }
}
