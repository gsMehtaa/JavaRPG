public class Main{

    public static void main(String[] args){

        Player player1 = new Player("Reyna", 10, 150);
        Player player2 = new Player("Jett", 150, 200);

        player1.displayStats();
        player1.takeDamage(20);
        player1.displayStats();

    }
}