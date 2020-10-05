package hue3;

public class Weapons {
    CombatType comtyp;
    DamageType damtyp;
    String name;
    int damage;
    int speed;
    int strength;
    int value;

    public Weapons(CombatType comtyp, DamageType damtyp, String name, int damage, int speed, int strength, int value) {
        this.comtyp = comtyp;
        this.damtyp = damtyp;
        this.name = name;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }
    
    
    
}