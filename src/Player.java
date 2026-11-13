public class Player {
    private String name;
    private int currentHP;
    private int maxHP;
    private int attackDamage;

    public Player(String name, int currentHP, int attackDamage, int maxHP){
        if (currentHP > maxHP){
            this.currentHP = maxHP;
        }
        else if(currentHP < 0) {
        this.currentHP = 0;
        }
        else {
            this.currentHP = currentHP;
        }
        this.name = name;
        this.attackDamage = attackDamage;
        this.maxHP = maxHP;
    }

    public void displayStats(){
        System.out.println(name);
        System.out.println("HP: " + currentHP + "/" + maxHP);
        System.out.println("DMG: " + attackDamage);
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
//build an attacking function and make players attack each other/enemies.
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
        if(currentHP > 0 && currentHP < maxHP){ //medkit heals to max hp.
            currentHP = maxHP;
        }
        else if(currentHP == maxHP){
            System.out.println("ALREADY MAX HP");
        }
        else{
            System.out.println("CAN'T HEAL");
        }
    }


    public void displayHealthBar() {
        if (maxHP <= 0) {
            System.out.println("Invalid max HP");
            return;
        }

        int bars = (currentHP * 10) / maxHP;

        System.out.print(name + " HP: [");

        for (int i = 0; i < 10; i++) {
            if (i < bars) {
                System.out.print("█");
            } else {
                System.out.print("-");
            }
        }

        System.out.println("] " + currentHP + "/" + maxHP);
    }



}
