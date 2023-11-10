
public class Main {
    public static void main(String[] args) {

        TicTacToe ticTacToe=new TicTacToe(new Player('x'),new Player('0'),new Board());
        Result result=  ticTacToe.start();
        if(result.isDraw())
        {
            System.out.println("The match ended in a Draw");
        }
        else {
            System.out.println("Player with symbol : "  +result.getWinner().getSymbol()+" won ...");
        }
    }
}