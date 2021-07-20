import java.util.Random;

public class Kamado implements Slayers{
    
    Random random = new Random();
    public String name = "Kamado Tanjiro";
    public int healthTanjiro = 100;
    int damageAbsorbed;
    int maxDamage = 15;
    int lowestDamage = 10;
    int damageDealt;
    
    @Override
    public int dealDamage(){
        damageDealt = random.nextInt(maxDamage-lowestDamage+1)+lowestDamage;
        return damageDealt;
    }  
    @Override
    public String evade(int damage){
        return "Tanjiro evaded but took "+Math.ceil(damage*0.20)+" damage.";
    }
    @Override
    public String run(String enemy){
        return "You ran away from "+ enemy + " but you lost 1 life.";
    }
    @Override
    public void gotHit(int damage){
        healthTanjiro -= damage;
        damageAbsorbed = damage;
    }
    @Override
    public String printStats(){
        String newHealth = name+"s current health is "+healthTanjiro+".\n";
        String newDamageDealt = "Damage done "+damageDealt+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+". ";
        if (healthTanjiro <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + newDamageDealt + healsRemaining;
    }
    @Override
    public String printStatsMuzan(){
        String newHealth = name+"s current health is "+healthTanjiro+".\n";
        String newDamageDealt = "Damage done "+(int)Math.round(damageDealt*0.70)+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+". ";
        if (healthTanjiro <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + newDamageDealt + healsRemaining;
    }
    public String printStatsEvade() {
        String newHealth = name+"s health is "+healthTanjiro+".\n";
        String healsRemaining = "Heals remaining "+DemonSlayerMain.heals+".";
        if (healthTanjiro <= 0)
            newHealth = name+"s current health is 0.\n";
        return newHealth + "You evaded an attack.\n" + healsRemaining;
    }
    @Override
    public int getHealth() {
        return healthTanjiro;
    }
}