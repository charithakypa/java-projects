// import
import board.Board;
import player.Player;
import game.Game;

public class App
{   public void app()
    {}

    public static void main(String[] args) throws Exception
    {
        System.out.println("first project : tictactoe");
        Board b = new Board(4,'-');
        b.printBoardConfig();
        Player p1=new Player();
        p1.setPlayerNameAndSymbol("cherry",'X');
        p1.getPlayerNameAndSymbol();
       
        Player p2=new Player();
        p2.setPlayerNameAndSymbol("raja",'O');
        p2.getPlayerNameAndSymbol();
        Game game= new Game(new Player[] {p1,p2},b);
       game.play();
    }
   

}
