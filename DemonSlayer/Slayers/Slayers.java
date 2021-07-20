package DemonSlayer.Slayers;

public abstract class Slayers{

    abstract int dealDamage();
    abstract String evade(int damage);
    abstract String run(String enemy);
    abstract void gotHit(int damage);
    abstract int getHealth();
    abstract String printStats();
    abstract String printStatsMuzan();
    abstract String printStatsEvade();
}
