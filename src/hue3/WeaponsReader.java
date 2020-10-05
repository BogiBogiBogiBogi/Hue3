package hue3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeaponsReader {

    public WeaponsReader() {
    }

    public ArrayList<Weapons> readFile() {
        ArrayList<Weapons> list = new ArrayList<Weapons>();

        try {
            File file = new File("weapons.csv");
            Scanner scan = new Scanner(file);
            String s = "";
            scan.nextLine();
            while (scan.hasNext()) {
                s = scan.nextLine();
                String array[] = s.split(";");
                Weapons w;
                w = new Weapons(CombatType.valueOf(array[1].toUpperCase()), DamageType.valueOf(array[2].toUpperCase()), array[0], Integer.parseInt(array[3]), Integer.parseInt(array[4]), Integer.parseInt(array[5]), Integer.parseInt(array[6]));
                list.add(w);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WeaponsReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
