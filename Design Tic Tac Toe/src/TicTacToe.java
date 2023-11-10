

//Design Tic Tac Toe ,3*3 board,2 Players: '0','x'
//Step 1:Gather concrete req.
//
//Players should be able to take turns 1 after the other
//players take turn on a board
//game either terminates in draw or victory
//
////Req:
//1.There is a 3x3 board
//2. 2 players play game
//3.each player makes a turn alternatively
//4.either a symbol 'x' or '0' is assigned to the players
//5.In each turn the player puts his symbol on any empty cell
//6.Game terminates scenario: -
//i.either if the board is full:Draw
//ii.if there is a straight line vert/hor/diagnol containing the same symbol: winner ==> owner
//
//step 2:Nouns
//Identifications of entities :Board ,player ,Game ,symbol,Turn
//      Game
//      /  \
//  Player Board
//  /  \
// A    B
//
//Top Bottom vs Bottom Top
public class TicTacToe {
    private final Player player1,player2;
    private final Board board;

    public TicTacToe(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    Result start(){
        Player currentPlayer=this.player1;
        while(!this.board.isFull())
        {
            Move currentMove=currentPlayer.play();
            this.board.applyMove(currentMove,currentPlayer.getSymbol());
            if(this.board.hasWinningLine(currentPlayer.getSymbol())){
                System.out.println("The game is up...");
                return new Result(false,currentPlayer);
            }
            if(currentPlayer == this.player1)
                currentPlayer=this.player2;
            else
                currentPlayer=this.player1;
        }
        return  new Result(true,null) ;









    }
}
