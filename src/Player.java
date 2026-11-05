public class Player {

    private String name;
    private int health;
    private int attackDamage;

    public Player(String name, int health, int attackDamage){
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
    }
    public void displayStats(){
        System.out.println(name);
        System.out.println("HP: " + health);
        System.out.println("DMG " + attackDamage);
    }
}
