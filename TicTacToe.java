import java.util.Scanner;

/**
 * TicTacToe Generates a TicTacToe Board Which Interacts with the User to Play a Game
 * 
 * @author Alan Lekah, Nathan Klair
 * @version 10/17/2012
 */
public class TicTacToe
{
    public static int turn = 1;
    public static boolean stopped;
    private static int gameType;
    private static int a;
    private static String x;

    /**
     * Constructor for objects of class Board, Rules, AI, Scanner, Players, and Grid and Runs the Game in Console Window
     */
    public static void main(String[] args)
    {       
        Board board = new Board();
        Players players = new Players();
        Scanner in = new Scanner(System.in);
        Rules rules = new Rules();
        AI computer = new AI(rules);

        System.out.println("************************************************************");
        System.out.println("Welcome to Alan Lekah's and Nathan Klair's Tic-Tac-Toe Game!");
        System.out.println("************************************************************");
        System.out.println();
        System.out.println("Rules");
        System.out.println("-----");
        System.out.println("1. You must enter a valid number in the range 1-9 or you WILL LOSE YOUR TURN");
        System.out.println();

        System.out.println("** Please Enter A Game Type **");
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("1: Single Player (Human VS Computer)");
        System.out.println();
        System.out.println("2: Two Players (Human VS Human)");
        System.out.println();
        System.out.println("3: Zero Players (Computer VS Computer)");
        System.out.println();
        System.out.println("4: Quit Game");
        System.out.println();
        System.out.print("Game Type: ");
        int gameType = in.nextInt();
        System.out.println();

        if (gameType == 4) // TO QUIT
        {
            System.exit(0);
        }

        while (gameType == 3) // FOR COMPUTER VS COMPUTER PLAY
        {            
            System.out.println();
            String player1name = "Computer1";
            String player2name = "Computer2";
            players.setPlayerName(player1name, player2name);
            System.out.println();

            Grid grid = new Grid(board, players, rules);
            stopped = false;

            while (!stopped)
            {

                for (int i = 0; i < 9; i++)
                {
                    grid.printBoard(board, players, rules);
                    System.out.println();
                    if (i % 2 == 0)
                    {
                        computer.takeTurn(board, rules, computer.decidePosition(board, rules));
                        try {
                            System.out.println("Hmmm, Thinking...");
                            Thread.sleep(800);
                        } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println();
                        System.out.println("I Choose Space: #" + computer.getComputerMove()); 
                        System.out.println();

                        board.setPosValue(x,a);
                    }
                    else
                    {
                        computer.takeTurn(board, rules, computer.decidePosition(board, rules));
                        try {
                            System.out.println("Hmmm, Thinking...");
                            Thread.sleep(800);
                        } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println();
                        System.out.println("I Choose Space: #" + computer.getComputerMove()); 
                        System.out.println();
                    }

                    if (rules.isWinner(board))
                    {
                        if (i % 2 == 0)
                        {
                            String p1 = players.getPlayerName(1);
                            players.setPlayerScore(p1);
                            board.setPosValue(x,a);
                            grid.printBoard(board, players, rules);
                            System.out.println(p1 + " is the Winner!");
                            break;
                        }
                        else
                        {
                            String p2 = players.getPlayerName(2);
                            players.setPlayerScore(p2);
                            board.setPosValue(x,a);
                            grid.printBoard(board, players, rules);
                            System.out.println(p2 + " is the Winner!");
                            break;
                        }
                    }
                    else
                    {
                        if (turn == 9)
                        {
                            grid.printBoard(board, players, rules);
                            System.out.println("Nobody Is the Winner!");
                            break;
                        }
                    }
                    turn++;
                }  

                turn = 1;
                System.out.println();

                System.out.print("Would you like to play...again? (y/n) ");
                String input = in.next();
                input = input.toLowerCase();
                // System.out.println(input); # FOR DEBUG OF SYSTEM INPUT

                if (input.equals("y"))
                {
                    System.out.println();
                    System.out.print("Would you like to play a different game mode? ");
                    String gameChange = in.next();
                    if (gameChange.equals("y"))
                    {
                        System.out.println();
                        main(args);
                    }
                    else
                    {
                        System.out.println();
                        stopped = false;
                        board.clearPosValue();
                        rules.resetTurn();
                        rules.resetWinner();
                    }
                }
                else if (input.equals("n"))
                {
                    stopped = true;
                    System.exit(0);
                }
                else
                {
                    System.exit(0);
                }
            }
        }

        while (gameType == 1) // PLAYER VS COMPUTER 
        {            
            System.out.print("Please Enter Player's Name: ");
            String player1name = in.next();
            System.out.println();

            String player2name = "Computer";
            players.setPlayerName(player1name, player2name);
            System.out.println();

            Grid grid = new Grid(board, players, rules);
            stopped = false;

            while (!stopped)
            {

                for (int i = 0; i < 9; i++)
                {
                    grid.printBoard(board, players, rules);
                    System.out.println();
                    if (i % 2 == 0)
                    {
                        System.out.print("Enter A Grid Space: ");
                        a = in.nextInt();
                        x = Board.X;

                        if (rules.isFilled(a, board))
                        {
                            do
                            {
                                System.out.println("Sorry, but this space is already filled. Please Choose Another Space...");
                                System.out.println();
                                System.out.print("Enter A Grid Space: ");
                                a = in.nextInt();
                            }
                            while (rules.isFilled(a, board) == true);
                        }

                        board.setPosValue(x,a);
                    }
                    else
                    {
                        computer.takeTurn(board, rules, computer.decidePosition(board, rules));
                        try {
                            System.out.println("Hmmm, Thinking...");
                            Thread.sleep(1200);
                        } catch(InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println();
                        System.out.println("I Choose Space: #" + computer.getComputerMove()); 
                        System.out.println();
                    }

                    if (rules.isWinner(board))
                    {
                        if (i % 2 == 0)
                        {
                            String p1 = players.getPlayerName(1);
                            players.setPlayerScore(p1);
                            board.setPosValue(x,a);
                            grid.printBoard(board, players, rules);
                            System.out.println(p1 + " is the Winner!");
                            break;
                        }
                        else
                        {
                            String p2 = players.getPlayerName(2);
                            players.setPlayerScore(p2);
                            board.setPosValue(x,a);
                            grid.printBoard(board, players, rules);
                            System.out.println(p2 + " is the Winner!");
                            break;
                        }
                    }
                    else
                    {
                        if (turn == 9)
                        {
                            grid.printBoard(board, players, rules);
                            System.out.println("Nobody Is the Winner!");
                            break;
                        }
                    }
                    turn++;
                }  

                turn = 1;
                System.out.println();

                System.out.print("Would you like to play...again? (y/n) ");
                String input = in.next();
                input = input.toLowerCase();
                // System.out.println(input); # FOR DEBUG OF SYSTEM INPUT

                if (input.equals("y"))
                {
                    System.out.println();
                    System.out.print("Would you like to play a different game mode? ");
                    String gameChange = in.next();
                    if (gameChange.equals("y"))
                    {
                        System.out.println();
                        main(args);
                    }
                    else
                    {
                        System.out.println();
                        stopped = false;
                        board.clearPosValue();
                        rules.resetTurn();
                        rules.resetWinner();
                    }
                }
                else if (input.equals("n"))
                {
                    System.exit(0);
                }
                else
                {
                    stopped = true;
                    System.exit(0);
                } 
            }
        }

        while (gameType == 2) // PLAYER VS PLAYER
        {
            System.out.print("Please Enter Player 1's Name: ");
            String player1name = in.next();
            System.out.println();

            System.out.print("Please Enter Player 2's Name: ");
            String player2name = in.next();

            players.setPlayerName(player1name, player2name);
            System.out.println();

            Grid grid = new Grid(board, players, rules);

            stopped = false;
            String x;

            while (!stopped)
            {

                for (int i = 0; i < 9; i++)
                {
                    System.out.println();
                    System.out.println();
                    grid.printBoard(board, players, rules);
                    System.out.println();
                    System.out.print("Enter A Grid Space: ");
                    int a = in.nextInt();

                    if (i % 2 == 0)
                    {
                        x = Board.X;
                    }
                    else 
                    {
                        x = Board.O;
                    }

                    if (rules.isFilled(a, board))
                    {
                        do
                        {
                            System.out.println("Sorry, but this space is already filled. Please Choose Another Space...");
                            System.out.println();
                            System.out.print("Enter A Grid Space: ");
                            a = in.nextInt();
                        }
                        while (rules.isFilled(a, board) == true);
                    }
                    board.setPosValue(x,a);

                    if (rules.isWinner(board))
                    {
                        if (i % 2 == 0)
                        {
                            String p1 = players.getPlayerName(1);
                            players.setPlayerScore(p1);
                            grid.printBoard(board, players, rules);
                            System.out.println(p1 + " is the Winner!");
                            break;
                        }
                        else
                        {
                            String p2 = players.getPlayerName(2);
                            players.setPlayerScore(p2);
                            grid.printBoard(board, players, rules);
                            System.out.println(p2 + " is the Winner!");
                            break;
                        }
                    }
                    else
                    {
                        if (turn == 9)
                        {
                            grid.printBoard(board, players, rules);
                            System.out.println("Nobody Is the Winner!");
                            break;
                        }
                    }
                    turn++;
                }  
                turn = 1;
                System.out.println();
                System.out.print("Would you like to play...again? (y/n) ");
                String input = in.next();
                input = input.toLowerCase();
                // System.out.println(input); # FOR DEBUG OF SYSTEM INPUT

                if (input.equals("y"))
                {
                    System.out.println();
                    System.out.print("Would you like to play a different game mode? ");
                    String gameChange = in.next();
                    if (gameChange.equals("y"))
                    {
                        System.out.println();
                        main(args);
                    }
                    else
                    {
                        System.out.println();
                        stopped = false;
                        board.clearPosValue();
                        rules.resetTurn();
                        rules.resetWinner();
                    }
                }
                else if (input.equals("n"))
                {
                    System.exit(0);
                }
                else
                {
                    stopped = true;
                    System.exit(0);
                }
            }
        }
    }
}
