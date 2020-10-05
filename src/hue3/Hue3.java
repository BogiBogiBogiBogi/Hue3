package hue3;

import java.util.ArrayList;
import java.util.List;

public class Hue3 {

    public static void main(String[] args) {
        WeaponsReader red = new WeaponsReader();

        ArrayList<Weapons> liste = new ArrayList<Weapons>();

        liste = red.readFile();

        //liste.sort((w, t) -> Integer.compare(w.getDamage(), t.getDamage()));
        
        liste.sort((Weapons w, Weapons t) -> {
            int comparedComTyp = Integer.compare(w.getComtyp().ordinal(), t.getComtyp().ordinal());
            if (comparedComTyp == 0) {
                int comparedDamTyp = Integer.compare(w.getDamtyp().ordinal(), t.getDamtyp().ordinal());
                if (comparedDamTyp == 0) {
                    int compareName = w.getName().compareTo(t.getName());
                    return compareName;
                    
                } else {
                    return comparedDamTyp;
                }
            } else {
                return comparedComTyp;
            }
        });

        Printable pa = new Printable() {
            @Override
            public void print(List<Weapons> weapons) {
                weapons.forEach((s) -> System.out.println(s.toString()));
                
            }
        };
        
        pa.print(liste);
        
    }
}