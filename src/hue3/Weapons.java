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

    @Override
    public String toString() {
        return "comtyp=" + comtyp + ", damtyp=" + damtyp + ", name=" + name + ", damage=" + damage + ", speed=" + speed + ", strength=" + strength + ", value=" + value;
    }

    public int getDamage() {
        return damage;
    }

    public CombatType getComtyp() {
        return comtyp;
    }

    public DamageType getDamtyp() {
        return damtyp;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getValue() {
        return value;
    }

}
