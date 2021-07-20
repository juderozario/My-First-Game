


import java.util.Random;

public class Zenitsu implements Slayers{
    
    Random random = new Random();
    public String name = "Zenitsu Agatsuma";
    public int healthZenitsu = 100;
    public int damageAbsorbed;
    public int maxDamage = 12;
    public int lowestDamage = 7;
    public int damageDealt;

    @Override
    public int dealDamage(){
        damageDealt = random.nextInt(maxDamage-lowestDamage+1)+lowestDamage;
        return damageDealt;
    }
    @Override
    public String evade(int damage){ 
        return "Zenitsu Evaded Successfully";
    }
    @Override
    public String run(String enemy){
        return "You ran away from "+ enemy + " but you lost 1 life.";
    }
    @Override
    public void gotHit(int damage){
        healthZenitsu -= damage;
        damageAbsorbed = damage;
    }
    @Override
    public String printStats(){
        String newHealth = name+"s health is "+healthZenitsu+".\n";
        String newDamageDealt = "Damage done "+damageDealt+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+".";
        if (healthZenitsu <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + newDamageDealt + healsRemaining;
    }
    @Override
    public String printStatsMuzan() {
        String newHealth = name+"s health is "+healthZenitsu+".\n";
        String newDamageDealt = "Damage done "+(int)Math.round(damageDealt*0.70)+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+".";
        if (healthZenitsu <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + newDamageDealt + healsRemaining;
    }
    public String printStatsEvade() {
        String newHealth = name+"s health is "+healthZenitsu+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+".";
        if (healthZenitsu <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + "You evaded an attack.\n" + healsRemaining;
    }
    @Override
    public int getHealth() {
        return healthZenitsu;
    }
}
