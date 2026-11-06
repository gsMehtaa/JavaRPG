public class Player {

    private String name;
    private int health;
    private int attackDamage;

    private int damage = 0;

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
    public void takeDamage(int damage){

        if(health > 0 && health > damage){
            health  = health - damage;
        }
        else if(health == 0){
            System.out.println(name + " is already 0 HP");
        }
        else if(damage > health){
            health = 0;
        }


    }
}
