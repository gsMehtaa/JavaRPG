public class Main{

    public static void main(String[] args){

        Player player1 = new Player("Reyna", 100, 150);
        Player player2 = new Player("Jett", 100, 200);

        player1.displayStats();

        player1.takeDamage(40);
        player1.displayStats();

        player1.useBandage();
        player1.displayStats();

        player1.useBandage();
        player1.displayStats();


    }
}