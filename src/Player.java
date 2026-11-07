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
    public void takeDamage(int damage){
       if(damage <= 0){
           System.out.println("DAMAGE MUST BE POSITIVE");
       }
       else if(health == 0){
           System.out.println(name + " is already 0 HP");
       }
       else if(damage > health){
           health = 0;
       }
       else{
           health = health - damage;
       }
    }

    public void useBandage(){
        if(health > 0 && health <75) {      //bandage heals only upto 75 hp, 15 hp at a time.
            health = health + 15;
        }
        else{
            System.out.println("CANT USE BANDAGE");
        }
    }
    public void useMedkit(){
        if(health > 0 && health < 100){ //medkit heals to 100 hp.
            health = 100;
        }
        else if(health == 100){
            System.out.println("ALREADY FULL HP");
        }
        else{
            System.out.println("CAN'T HEAL");
        }
    }

}
