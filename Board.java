
/**
 * A Class to Generate and Input Values into Grid Class
 * 
 * @author Alan Lekah && Nathan Klair
 * @version 10/30/2012
 */
public class Board
{
    public static final String X = "X";
    public static final String O = "O";
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String FIVE = "5";
    public static final String SIX = "6";
    public static final String SEVEN = "7";
    public static final String EIGHT = "8";
    public static final String NINE = "9";
    public static final String ZERO = "0";
    private String pos1;
    private String pos2;
    private String pos3;
    private String pos4;
    private String pos5;
    private String pos6;
    private String pos7;
    private String pos8;
    private String pos9;
    private int x;
    private String b;
    private String p1_turn;
    private String p2_turn;
    
    /**
     * Contructor for an object of Type Board
     */
    public Board()
    {
        pos1 = Board.ONE;
        pos2 = Board.TWO;
        pos3 = Board.THREE;
        pos4 = Board.FOUR;
        pos5 = Board.FIVE;
        pos6 = Board.SIX;
        pos7 = Board.SEVEN;
        pos8 = Board.EIGHT;
        pos9 = Board.NINE;
    }
    
    /** 
     * Method That Resets Board To Show Position Values
     */    
    public void clearPosValue()
    {
        pos1 = Board.ONE;
        pos2 = Board.TWO;
        pos3 = Board.THREE;
        pos4 = Board.FOUR;
        pos5 = Board.FIVE;
        pos6 = Board.SIX;
        pos7 = Board.SEVEN;
        pos8 = Board.EIGHT;
        pos9 = Board.NINE;
    }

    /**
     * Method to Set Position Value
     * @param newX of Type String Sets X or O to position
     * @param position To Determine Correct Placement of X or O
     */
    public void setPosValue(String newX, int position)
    {
        if (position == 1) pos1 = newX;
        else if (position == 2) pos2 = newX;
        else if (position == 3) pos3 = newX;
        else if (position == 4) pos4 = newX;
        else if (position == 5) pos5 = newX;
        else if (position == 6) pos6 = newX;
        else if (position == 7) pos7 = newX;
        else if (position == 8) pos8 = newX;
        else if (position == 9) pos9 = newX;
    }

    /**
     * A Method to Return Symbol that Holds Position in Grid
     * @param  i  Position Number
     * @return   Return a String of Variable Position
     */
    public String getPosValue(int i)
    {
        if (i == 1) b = pos1;
        else if (i == 2)b = pos2;
        else if (i == 3) b = pos3;
        else if (i == 4) b = pos4;
        else if (i == 5) b = pos5;
        else if (i == 6) b = pos6;
        else if (i == 7) b = pos7;
        else if (i == 8) b = pos8;
        else if (i == 9) b = pos9;
        return b;
    }

}
