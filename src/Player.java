import java.util.Currency;

public class Player {

    private String name;
    private int currentHP;
    private int maxHP;
    private int attackDamage;




    public Player(String name, int currentHP, int attackDamage, int maxHP){
        this.name = name;
        this.currentHP = currentHP;
        this.attackDamage = attackDamage;
        this.maxHP = maxHP;

    }
    public void displayStats(){
        System.out.println(name);
        System.out.println("HP: " + currentHP);
        System.out.println("DMG " + attackDamage);
    }
    public void takeDamage(int damage){
       if(damage <= 0){
           System.out.println("DAMAGE MUST BE POSITIVE");
       }
       else if(currentHP == 0){
           System.out.println(name + " is already 0 HP");
       }
       else if(damage > currentHP){
           currentHP = 0;
       }
       else{
           currentHP = currentHP - damage;
       }
    }

    public void useBandage(){
       if(currentHP > 0 && currentHP < 75){
           if (currentHP + 15 > 75) {
               currentHP = 75;
           }
          else{
              currentHP = currentHP + 15;
           }
       }
        else{
            System.out.println("CANT USE BANDAGE");
        }
    }
    public void useMedkit(){
        if(currentHP > 0 && currentHP < 100){ //medkit heals to 100 hp.
            currentHP = 100;
        }
        else if(currentHP == 100){
            System.out.println("ALREADY FULL HP");
        }
        else{
            System.out.println("CAN'T HEAL");
        }
    }


}
