package DemonSlayer.Slayers;

import java.util.Random;
import DemonSlayer.DemonSlayerMain;

public class Inosuke extends Slayers{
    
    Random random = new Random();   
    public String name = "Inosuke Hashibira";
    public int healthInosuke = 100;
    public int damageAbsorbed;
    public int maxDamage = 17;
    public int lowestDamage = 8;
    public int damageDealt;
    
    @Override
    public int dealDamage(){
        damageDealt = random.nextInt(maxDamage-lowestDamage+1)+lowestDamage;
        return damageDealt;
    }

    @Override
    public String evade(int damage){
        return "Inosuke Cannot Evade Successfully";
    }

    @Override
    public String run(String enemy){
        return "You ran away from "+ enemy + " but you lost 1 life.";
    }

    @Override
    public void gotHit(int damage){
        healthInosuke -= damage;
        damageAbsorbed = damage;
    }

    @Override
    public String printStats(){
        String newHealth = name+"s health is "+healthInosuke+".\n";
        String newDamageDealt = "Damage done "+damageDealt+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+".";
        if (healthInosuke <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + newDamageDealt + healsRemaining;
    }
    @Override
    public String printStatsMuzan(){
        String newHealth = name+"s health is "+healthInosuke+".\n";
        String newDamageDealt = "Damage done "+(int)Math.round(damageDealt*0.70)+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+".";
        if (healthInosuke <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + newDamageDealt + healsRemaining;
    }
    public String printStatsEvade() {
        String newHealth = name+"s health is "+healthInosuke+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+".";
        if (healthInosuke <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + "You evaded an attack.\n" + healsRemaining;
    }
    @Override
    public int getHealth() {
        return healthInosuke;
    }
}
